import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
* This class is the DAO for the OrderLine database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class OrderLineDB implements OrderLineDBIF{
	private static final String insertOrderLineQ = "INSERT INTO OrderLines (fk_orderNumber, quantity, fk_productID) VALUES (?, ?, ?)";
	private PreparedStatement insertOrderLinePreparedStatement;

	//TODO: Add documentation...
	public OrderLineDB() {
		Connection connection = DBConnection.getInstance().getConnection();

		try {
			insertOrderLinePreparedStatement = connection.prepareStatement(insertOrderLineQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	@Override
	public void insertOrderLines(int orderNumber, List<OrderLine> orderLines) throws SQLException {
		for (OrderLine orderLine : orderLines) {
			insertOrderLine(orderNumber, orderLine);
		}
	}

	@Override
	public void insertOrderLine(int orderNumber, OrderLine orderLine) throws SQLException {
		insertOrderLinePreparedStatement.setInt(1, orderNumber);
		insertOrderLinePreparedStatement.setInt(2, orderLine.getQuantity());
		insertOrderLinePreparedStatement.setInt(3, orderLine.getProduct().getProductNumber());
		
		insertOrderLinePreparedStatement.executeUpdate();
	}
}
