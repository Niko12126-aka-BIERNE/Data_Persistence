import java.sql.PreparedStatement;

/**
* This class is the DAO for the Order database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class OrderDB implements OrderDBIF {
	private String insertOrderQ;
	private PreparedStatement insertOrderPreparedStatement;

	@Override
	public void insertOrder(Order order) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insertOrder'");
	}
}
