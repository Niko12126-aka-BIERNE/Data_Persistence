/**
* This is the interface for CustomerDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface CustomerDBIF {
	/**
	* This method finds a Customer by its customerID.
	* @param customerID The ID of the Customer.
	* @return Customer The Customer found with the given ID.
	*/
	public Customer findByCustomerID(int customerID);
}
