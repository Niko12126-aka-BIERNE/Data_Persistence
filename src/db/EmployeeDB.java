import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
* This class is the DAO for the Employee database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class EmployeeDB implements EmployeeDBIF {
	private String findByEmployeeIdQ;
	private PreparedStatement findByEmployeeIdPreparedStatement;

	/**
	* This method builds the Employee object from a ResultSet.
	* @param rs The ResultSet containing Employee information.
	* @return Employee The Employee object build from the ResultSet.
	*/
	public Employee buildObject(ResultSet rs) {
		//TODO: Add logic for this method!
		return null;
	}

	@Override
	public Employee findByEmployeeID(int employeeID) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findByEmployeeID'");
	}
}
