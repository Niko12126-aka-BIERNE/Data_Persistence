/**
* This is the controller for the Employee class.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class EmployeeController {
	private EmployeeDBIF employeeDB;

	/**
	* This is the constructor for the EmployeeController class.
	*/
	public EmployeeController() {
		this.employeeDB = new EmployeeDB();
	}

	/**
	* This method finds an Employee by its employeeID.
	* @param employeeID The ID of the Employee.
	* @return Employee The Employee found with the given ID.
	*/
	public Employee findEmployeeByEmployeeID(int employeeID) {
		//TODO: Add logic for this method!
		return null;
	}
}
