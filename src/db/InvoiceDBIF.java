/**
* This is the interface for InvoiceDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface InvoiceDBIF {
	/**
	* This method inserts an Invoice into the database.
	* @param invoice The Invoice to insert.
	*/
	public void insertInvoice(Invoice invoice);
}
