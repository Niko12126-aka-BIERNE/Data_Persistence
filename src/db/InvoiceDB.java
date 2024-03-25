import java.sql.PreparedStatement;

/**
* This class is the DAO for the Invoice database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class InvoiceDB implements InvoiceDBIF {
	private String insertInvoiceQ;
	private PreparedStatement insertInvoicePreparedStatement;

	@Override
	public void insertInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insertInvoice'");
	}
}
