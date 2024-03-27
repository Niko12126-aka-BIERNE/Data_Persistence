import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* This class is the DAO for the Employee database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class EmployeeDB implements EmployeeDBIF {
	private static final String findByEmployeeIdQ = "SELECT * FROM Employees WHERE employeeID = ?";
	private PreparedStatement findByEmployeeIdPreparedStatement;

	//TODO: Add documentation...
	public EmployeeDB() {
		Connection connection = DBConnection.getInstance().getConnection();

		try {
			findByEmployeeIdPreparedStatement = connection.prepareStatement(findByEmployeeIdQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method builds the Employee object from a ResultSet.
	* @param rs The ResultSet containing Employee information.
	* @return Employee The Employee object build from the ResultSet.
	*/
	public Employee buildObject(ResultSet rs) throws SQLException {
		Employee employee = new Employee(
			rs.getInt("employeeID"), 
			rs.getString("firstName"), 
			rs.getString("lastName")
			);

			return employee;
	}

	@Override
	public Employee findByEmployeeID(int employeeID) {
		Employee employee = null;

		try {
			findByEmployeeIdPreparedStatement.setInt(1, employeeID);
			ResultSet rs = findByEmployeeIdPreparedStatement.executeQuery();

			if (rs.next()) {
				employee = buildObject(rs);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}

		return employee;
	}
}
