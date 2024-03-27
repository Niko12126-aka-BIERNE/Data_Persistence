import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
* This class is the DAO for the Stock database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class StockDB implements StockDBIF {
	private static final String updateQuantityQ = "UPDATE Stocks SET quantity = ? WHERE fk_warehouseID = ? AND fk_productID = ?";
	private PreparedStatement updateQuantityPreparedStatement;
	
	//TODO: Add documentation...
	public StockDB() {
		Connection connection = DBConnection.getInstance().getConnection();

		try {
			updateQuantityPreparedStatement = connection.prepareStatement(updateQuantityQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	@Override
	public void updateQuantitys(List<OrderLine> orderLines) throws SQLException {
		for (OrderLine orderLine : orderLines) {
			updateQuantity(orderLine);
		}
	}

	@Override
	public void updateQuantity(OrderLine orderLine) throws SQLException {
		updateQuantityPreparedStatement.setInt(1, orderLine.getQuantity());
		updateQuantityPreparedStatement.setInt(2, 1); //TODO: Fix hard coded warehouseID here...
		updateQuantityPreparedStatement.setInt(3, orderLine.getProduct().getProductNumber());

		updateQuantityPreparedStatement.executeUpdate();
	}
}
