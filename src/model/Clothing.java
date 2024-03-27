/**
* This is a subclass of Product that represents a Clothing Product.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Clothing extends Product {
	private int size;
	private String color;

	/**
	* This is the constructor for the Clothing class.
	* @param productNumber The productNumber of the product.
	* @param name The name of the product.
	* @param barcode The barcode of the product.
	* @param countryOfOrigin The country of origin of the product.
	* @param minStock The minimum amount of stock of the product.
	* @param price The price for this product with a date attached.
	* @param size The size of the clothing.
	* @param color The color of the clothing.
	*/
	public Clothing(int productNumber, String name, String barcode, String countryOfOrigin, int minStock, Price price, int size, String color) {
		super(productNumber, name, barcode, countryOfOrigin, minStock, price);
		this.size = size;
		this.color = color;
	}

	//TODO: doucmentation here...
	public int getSize() {
		return size;
	}

	//TODO: doucmentation here...
	public String getColor() {
		return color;
	}
}
