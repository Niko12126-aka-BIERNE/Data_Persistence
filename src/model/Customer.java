/**
* This class represents a Customer.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Customer {
	private int customerID;
	private String firstName;
	private String lastName;
	private String phone;
	private Address address;
	
	/**
	 * This is the constructor for the Customer class.
	 * @param customerID The ID of the customer.
	 * @param firstName The first name of the customer.
	 * @param lastName The last name of the customer.
	 * @param phone The phone number of the customer.
	 */
	public Customer(int customerID, String firstName, String lastName, String phone, Address address) {
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	//TODO: doucmentation here...
	public int getCustomerID() {
		return customerID;
	}
	
	//TODO: doucmentation here...
	public String getFirstName() {
		return firstName;
	}
	
	//TODO: doucmentation here...
	public String getLastName() {
		return lastName;
	}
	
	//TODO: doucmentation here...
	public String getPhone() {
		return phone;
	}
	
	//TODO: doucmentation here...
	public Address getAddress() {
		return address;
	}
}
