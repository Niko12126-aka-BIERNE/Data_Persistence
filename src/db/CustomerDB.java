import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
* This class is the DAO for the Customer database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class CustomerDB implements CustomerDBIF {
	private String findByCustomerIdQ;
	private PreparedStatement findByCustomerIdPreparedStatement;

	/**
	* This method builds the Customer object from a ResultSet.
	* @param rs The ResultSet containing Customer information.
	* @return Customer The Customer object build from the ResultSet.
	*/
	public Customer buildObject(ResultSet rs) {
		//TODO: Add logic for this method!
		return null;
	}

	@Override
	public Customer findByCustomerID(int customerID) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findByCustomerID'");
	}
}
