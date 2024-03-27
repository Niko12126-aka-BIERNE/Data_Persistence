import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
* This class is the DAO for the Order database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class OrderDB implements OrderDBIF {
	private static final String insertOrderQ = "INSERT INTO Orders (date, totalPrice, deliveryStatus, deliveryDate, fk_invoiceNumber, fk_customerID, fk_employeeID) VALUES (?, ?, ?, ?, ?, ?, ?)";
	private PreparedStatement insertOrderPreparedStatement;
	private InvoiceDBIF invoiceDB;
	private OrderLineDBIF orderLineDB;
	private StockDBIF stockDB;

	//TODO: Add documentation...
	public OrderDB() {
		Connection connection = DBConnection.getInstance().getConnection();
		invoiceDB = new InvoiceDB();
		orderLineDB = new OrderLineDB();
		stockDB = new StockDB();

		try {
			insertOrderPreparedStatement = connection.prepareStatement(insertOrderQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	@Override
	public void insertOrder(Order order) throws SQLException {
		DBConnection dbConnection = DBConnection.getInstance();
		try {
			dbConnection.startTransaction();
			
			insertOrderPreparedStatement.setDate(1, java.sql.Date.valueOf(order.getDate()));
			insertOrderPreparedStatement.setDouble(2, order.getTotalPrice());
			insertOrderPreparedStatement.setString(3, order.getDeliveryStatus());
			insertOrderPreparedStatement.setDate(4, java.sql.Date.valueOf(order.getDeliveryDate()));
			int invoiceNumber = invoiceDB.insertInvoice(order.getInvoice());
			insertOrderPreparedStatement.setInt(5, invoiceNumber);
			insertOrderPreparedStatement.setInt(6, order.getCustomer().getCustomerID());
			insertOrderPreparedStatement.setInt(7, order.getEmployee().getEmployeeID());

			int orderNumber = dbConnection.executeInsertWithIdentity(insertOrderPreparedStatement);
			
			orderLineDB.insertOrderLines(orderNumber, order.getOrderLines());

			stockDB.updateQuantitys(order.getOrderLines()); //TODO: This maybe makes more sence to run when inserting orderLines instead of afterwards...

			dbConnection.commitTransaction();
		} catch (SQLException e) {
			dbConnection.rollbackTransaction();
			throw e;
		}
	}
}
