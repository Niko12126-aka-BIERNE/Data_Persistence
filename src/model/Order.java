import java.time.LocalDate;

/**
* This class represents an Order.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Order {
	private int orderNumber;
	private LocalDate date;
	private double totalPrice;
	private String deliveryStatus;
	private LocalDate deliveryDate;
	private Employee employee;
	private Customer customer;
	private Invoice invoice;

	/**
	* This is the constructor for the Order class.
	* @param date The date of the Order.
	* @param deliveryStatus The status of delivery for the Order.
	* @param deliveryDate The date of delivery for the order.
	*/
	public Order(Employee employee) {
		this.date = LocalDate.now();
		this.deliveryStatus = "Getting packed";
		this.deliveryDate = LocalDate.now().plusDays(7);
		this.employee = employee;
	}

	/**
	* This method adds an OrderLine to the Order.
	* @param orderLine The OrderLine to at to the Order.
	*/
	public void addOrderLine(OrderLine orderLine) {
		//TODO: Add logic for this method!
	}

	/**
	* This method assigns a Customer to the Order.
	* @param customer The Customer to assign to the Order.
	*/
	public void assignCustomer(Customer customer) {
		//TODO: Add logic for this method!
	}

	/**
	* This method gets the totalprice.
	* @return double The total price of the Order.
	*/
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	* This method assigns an Invoice to the Order.
	* @param invoice The Invoice to assign to the Order.
	*/
	public void assignInvoice(Invoice invoice) {
		//TODO: Add logic for this method!
	}
}
