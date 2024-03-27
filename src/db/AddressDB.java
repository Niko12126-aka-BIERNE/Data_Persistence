import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* This class is the DAO for the Address database.
* @author Nikolaj Andersen
* @version 27/03/2024
*/
public class AddressDB implements AddressDBIF {
	private static final String findByAddressIdQ = "SELECT * FROM Addresses INNER JOIN Cities ON Addresses.fk_zipcode = Cities.zipcode WHERE addressID = ?";
	private PreparedStatement findByAddressIdPreparedStatement;

	//TODO: Add documentation...
	public AddressDB() {
		Connection connection = DBConnection.getInstance().getConnection();

		try {
			findByAddressIdPreparedStatement = connection.prepareStatement(findByAddressIdQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	This method builds the Address object from a ResultSet.
	* @param rs The ResultSet containing Address information.
	* @return Address The Address object build from the ResultSet.
	*/
	public Address buildObject(ResultSet rs) throws SQLException {
		Address address = new Address(
			rs.getInt("addressID"), 
			rs.getString("streetName"), 
			rs.getInt("houseNumber"), 
			rs.getInt("floorNumber"), 
			rs.getInt("doorNumber"), 
			rs.getString("zipcode"), 
			rs.getString("cityName")
		);

		return address;
	}

	@Override
	public Address findByAddressID(int addressID) {
		Address address = null;

		try {
			findByAddressIdPreparedStatement.setInt(1, addressID);
			ResultSet rs = findByAddressIdPreparedStatement.executeQuery();

			if (rs.next()) {
				address = buildObject(rs);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}

		return address;
	}
}
