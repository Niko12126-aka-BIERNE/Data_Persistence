/**
* This class represents an OrderLine.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class OrderLine {
	private Product product;
	private int quantity;

	/**
	* This is the constructor for the OrderLine class.
	* @param product The Product in the OrderLine.
	* @param quantity The quantity of the Product.
	*/
	public OrderLine(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
}
