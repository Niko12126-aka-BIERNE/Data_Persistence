/**
* This is the controller for the Order class.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class OrderController {
	private EmployeeController employeeController;
	private CustomerController customerController;
	private ProductController productController;
	private InvoiceController invoiceController;
	private OrderDBIF orderDB;
	private Order currOrder;

	/**
	* This is the constructor for the OrderController class.
	*/
	public OrderController() {
		this.employeeController = new EmployeeController();
		this.customerController = new CustomerController();
		this.productController = new ProductController();
		this.invoiceController = new InvoiceController();
		this.orderDB = new OrderDB();
	}

	/**
	* This method creats an Order.
	* @param employeeID The Employee who performed this action.
	*/
	public void createOrder(int employeeID) {
		//TODO: Add logic for this method!
	}

	/**
	* This method adds a Product to the Order.
	* @param productNumber The product number of the product to add.
	* @param quantity The quantity of the Product to add.
	* @return boolean An indication whether or not this method succeded.
	*/
	public boolean addProductToOrder(int productNumber, int quantity) {
		//TODO: Add logic for this method!
		return false;
	}

	/**
	* This method assigns a Customer to the current Order.
	* @param customerID The ID of the Customer to assign.
	* @return boolean An indication whether or not this method succeded.
	*/
	public boolean assignCustomerToOrder(int customerID) {
		//TODO: Add logic for this method!
		return false;
	}

	/**
	* This method finishes the current Order.
	* @return boolean An indication whether or not this method succeded.
	*/
	public boolean finishOrder() {
		//TODO: Add logic for this method!
		return false;
	}
}
