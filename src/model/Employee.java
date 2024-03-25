/**
* This class represents an Employee.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Employee {
	private int employeeID;
	private String firstName;
	private String lastName;

	/**
	* This is the constructor for the Employee class.
	* @param employeeID The ID of the Employee.
	* @param firstName The first name of the Employee.
	* @param lastName The last name of the Employee.
	*/
	public Employee(int employeeID, String firstName, String lastName) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
