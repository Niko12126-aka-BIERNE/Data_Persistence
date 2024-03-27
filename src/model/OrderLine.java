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

	/**
	* This method gets the Product of the OrderLine.
	* @return Product The Product of the OrderLine.
	*/
	public Product getProduct() {
		return product;
	}

	/**
	* This method increases the quantity of the Product of the OrderLine.
	* @param quantity The quantity to increase by.
	*/
	public void increaseQuantity(int quantity) {
		this.quantity += quantity;
	}

	/**
	* This method gets the quantity of the Product of the OrderLine.
	* @return int The quantity of the Product of the OrderLine.
	*/
	public int getQuantity() {
		return quantity;
	}
}
