import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
* This class is the DAO for the Invoice database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class InvoiceDB implements InvoiceDBIF {
	private static final String insertInvoiceQ = "INSERT INTO Invoices (paymentDate, paymentAmount, isPaid) VALUES (?, ?, ?)";
	private PreparedStatement insertInvoicePreparedStatement;

	//TODO: Add documentation...
	public InvoiceDB() {
		Connection connection = DBConnection.getInstance().getConnection();

		try {
			insertInvoicePreparedStatement = connection.prepareStatement(insertInvoiceQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	@Override
	public int insertInvoice(Invoice invoice) throws SQLException{
		DBConnection dbConnection = DBConnection.getInstance();
		
		insertInvoicePreparedStatement.setDate(1, java.sql.Date.valueOf(invoice.getPaymentDate()));
		insertInvoicePreparedStatement.setDouble(2, invoice.getPaymentAmount());
		insertInvoicePreparedStatement.setBoolean(3, invoice.isPaid());

		int invoiceNumber = dbConnection.executeInsertWithIdentity(insertInvoicePreparedStatement);
		return invoiceNumber;
	}
}
