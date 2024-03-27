import java.time.LocalDate;

/**
* This class represents an Invoice.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Invoice {
	private LocalDate paymentDate;
	private double paymentAmount;
	private boolean isPaid;
	
	/**
	 * This is the constructor for the Invoice class.
	 * @param paymentDate The date of the payment.
	 * @param paymentAmount The amount to pay.
	 * @param isPaid The indicator that tells if the Invoice has been paid.
	 */
	public Invoice(LocalDate paymentDate, double paymentAmount, boolean isPaid) {
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.isPaid = isPaid;
	}
	
	//TODO: doucmentation here...
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	
	//TODO: doucmentation here...
	public double getPaymentAmount() {
		return paymentAmount;
	}
	
	//TODO: doucmentation here...
	public boolean isPaid() {
		return isPaid;
	}
}
