import java.sql.PreparedStatement;
import java.util.List;

/**
* This class is the DAO for the Stock database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class StockDB implements StockDBIF {
	private String updateQuantityQ;
	private PreparedStatement updateQuantityPreparedStatement;

	@Override
	public void updateQuantity(List<OrderLine> orderLines) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'updateQuantity'");
	}
}
