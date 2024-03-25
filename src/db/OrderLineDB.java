import java.sql.PreparedStatement;
import java.util.List;

/**
* This class is the DAO for the OrderLine database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class OrderLineDB implements OrderLineDBIF{
	private String insertOrderLineQ;
	private PreparedStatement insertOrderLinePreparedStatement;

	@Override
	public void insertOrderLines(List<OrderLine> orderLines) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'insertOrderLines'");
	}
}
