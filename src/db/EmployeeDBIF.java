/**
* This is the interface for EmployeeDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface EmployeeDBIF {
	/**
	* This method finds an Employee by its employeeID.
	* @param employeeID The ID of the Employee.
	* @return Employee The Employee found with the given ID.
	*/
	public Employee findByEmployeeID(int employeeID);
}
