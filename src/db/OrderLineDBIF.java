import java.util.List;

/**
* This is the interface for OrderLineDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface OrderLineDBIF {
	/**
	* This method inserts a List of OrderLines into the database.
	* @param orderLines The List of OrderLines to insert.
	*/
	public void insertOrderLines(List<OrderLine> orderLines);
}
