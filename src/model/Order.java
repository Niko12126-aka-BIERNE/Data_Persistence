import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
	private List<OrderLine> orderLines;

	
	/**
	 * This is the constructor for the Order class.
	 * @param date The date of the Order.
	 * @param deliveryStatus The status of delivery for the Order.
	 * @param deliveryDate The date of delivery for the order.
	 */
	public Order(Employee employee) {
		this.date = LocalDate.now();
		this.totalPrice = 0;
		this.deliveryStatus = "Getting packed";
		this.deliveryDate = LocalDate.now().plusDays(7);
		this.employee = employee;
		this.orderLines = new ArrayList<OrderLine>();
	}
	
	/**
	 * This method adds an OrderLine to the Order.
	 * @param orderLine The OrderLine to at to the Order.
	 */
	public void addOrderLine(OrderLine orderLine) {
		boolean isDuplicate = false;
		
		int productNumber = orderLine.getProduct().getProductNumber();
		for (int i = 0; i < orderLines.size(); i++) {
			int currProductNumber = orderLines.get(i).getProduct().getProductNumber();
			
			if (currProductNumber == productNumber) {
				orderLines.get(i).increaseQuantity(orderLine.getQuantity());
				isDuplicate = true;
			}
		}
		
		if (!isDuplicate) {
			orderLines.add(orderLine);
		}
		
		increaseTotalPrice(orderLine.getProduct().getProductPrice() * orderLine.getQuantity());
	}
	
	/**
	 * This method assigns a Customer to the Order.
	 * @param customer The Customer to assign to the Order.
	 */
	public void assignCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 * This method gets the totalprice.
	 * @return double The total price of the Order.
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	
	//TODO: doucmentation here...
	public int getOrderNumber() {
		return orderNumber;
	}

	//TODO: doucmentation here...
	public LocalDate getDate() {
		return date;
	}

	//TODO: doucmentation here...
	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	//TODO: doucmentation here...
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	//TODO: doucmentation here...
	public Employee getEmployee() {
		return employee;
	}

	//TODO: doucmentation here...
	public Customer getCustomer() {
		return customer;
	}

	//TODO: doucmentation here...
	public Invoice getInvoice() {
		return invoice;
	}

	//TODO: doucmentation here...
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	
	/**
	 * This method increases the total price of the Order.
	 * @param amount The amount to increase the total price of the Order by.
	 */
	public void increaseTotalPrice(double amount) {
		totalPrice += amount;
	}
	
	/**
	* This method assigns an Invoice to the Order.
	* @param invoice The Invoice to assign to the Order.
	*/
	public void assignInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
