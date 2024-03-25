/**
* This is the interface for OrderDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface OrderDBIF {
	/**
	* This method inserts an Order into the database.
	* @param order The Order to insert.
	*/
	public void insertOrder(Order order);
}
