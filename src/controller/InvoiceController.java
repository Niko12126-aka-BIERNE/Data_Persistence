/**
* This is the controller for the Invoice class.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class InvoiceController {
	/**
	* This method creats an Invoice.
	* @param paymentAmount The paymentAmount of the Invoice.
	* @return Invoice The created Invoice.
	*/
	public Invoice createInvoice(double paymentAmount) {
		return new Invoice(null, paymentAmount, false);
	}
}
