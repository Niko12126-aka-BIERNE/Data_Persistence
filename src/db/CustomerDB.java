import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* This class is the DAO for the Customer database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class CustomerDB implements CustomerDBIF {
	private static final String findByCustomerIdQ = "SELECT * FROM Customers WHERE customerID = ?";
	private PreparedStatement findByCustomerIdPreparedStatement;
	private AddressDBIF addressDB;

	//TODO: Add documentation...
	public CustomerDB() {
		Connection connection = DBConnection.getInstance().getConnection();
		addressDB = new AddressDB();

		try {
			findByCustomerIdPreparedStatement = connection.prepareStatement(findByCustomerIdQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method builds the Customer object from a ResultSet.
	* @param rs The ResultSet containing Customer information.
	* @return Customer The Customer object build from the ResultSet.
	*/
	public Customer buildObject(ResultSet rs) throws SQLException {
		Customer customer = new Customer(
			rs.getInt("customerID"), 
			rs.getString("firstName"), 
			rs.getString("lastName"),
			rs.getString("phone"), 
			addressDB.findByAddressID(rs.getInt("fk_addressID"))
		);

		return customer;
	}

	@Override
	public Customer findByCustomerID(int customerID) {
		Customer customer = null;

		try {
			findByCustomerIdPreparedStatement.setInt(1, customerID);
			ResultSet rs = findByCustomerIdPreparedStatement.executeQuery();

			if (rs.next()) {
				customer = buildObject(rs);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}

		return customer;
	}
}
