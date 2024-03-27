/**
* This is the controller for the Customer class.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class CustomerController {
	private CustomerDBIF customerDB;

	/**
	* This is the constructor for the CustomerController class.
	*/
	public CustomerController() {
		this.customerDB = new CustomerDB();
	}

	/**
	* This method finds a Customer by its customerID.
	* @param customerID The ID of the customer.
	* @return Customer The Customer found with the given ID.
	*/
	public Customer findCustomerByCustomerID(int customerID) {
		return customerDB.findByCustomerID(customerID);
	}
}
