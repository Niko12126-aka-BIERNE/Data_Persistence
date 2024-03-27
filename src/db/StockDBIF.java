import java.sql.SQLException;
import java.util.List;

/**
* This is the interface for StockDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface StockDBIF {
	/**
	* This method updates the quantity of a List of Products in stock.
	* @param orderLines The List of OrderLines used to get the product to update stock on and the quantity to decrease quantity by.
	*/
	public void updateQuantitys(List<OrderLine> orderLines) throws SQLException;

	/**
	* This method updates the quantity of a Product in stock.
	* @param orderLine The OrderLine used to get the product to update stock on and the quantity to decrease quantity by.
	*/
	public void updateQuantity(OrderLine orderLines) throws SQLException;
}
