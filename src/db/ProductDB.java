import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
* This class is the DAO for the Product database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class ProductDB implements ProductDBIF {
	private static final String findByProductNumberQ = "SELECT * FROM Products WHERE productID = ?";
	private PreparedStatement findByProductNumberPreparedStatement;
	private PriceDBIF priceDB;

	//TODO: Add documentation...
	public ProductDB() {
		Connection connection = DBConnection.getInstance().getConnection();
		priceDB = new PriceDB();

		try {
			findByProductNumberPreparedStatement = connection.prepareStatement(findByProductNumberQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method builds the Product object from a ResultSet.
	* @param rs The ResultSet containing Product information.
	* @return Product The Product object build from the ResultSet.
	*/
	public Product buildObject(ResultSet rs) throws SQLException {
		Product product = new Product(
			rs.getInt("productID"), 
			rs.getString("name"), 
			rs.getString("barcode"), 
			rs.getString("countryOfOrigin"), 
			rs.getInt("minStock"), 
			priceDB.findByProductNumberAndDate(rs.getInt("productID"), LocalDate.now()) //TODO: Fix hard coded date here...
		);

		return product;
	}

	@Override
	public Product findByProductNumber(int productNumber) {
		Product product = null;

		try {
			findByProductNumberPreparedStatement.setInt(1, productNumber);
			ResultSet rs = findByProductNumberPreparedStatement.executeQuery();

			if (rs.next()) {
				product = buildObject(rs);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}

		return product;
	}
}
