/**
* This class represents a Product.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Product {
	private int productNumber;
	private String name;
	private String barcode;
	private String countryOfOrigin;
	private int minStock;

	/**
	* This is the constructor for the Product class.
	* @param productNumber The productNumber of the product.
	* @param name The name of the product.
	* @param barcode The barcode of the product.
	* @param countryOfOrigin The country of origin of the product.
	* @param minStock The minimum amount of stock of the product.
	*/
	public Product(int productNumber, String name, String barcode, String countryOfOrigin, int minStock) {
		this.productNumber = productNumber;
		this.name = name;
		this.barcode = barcode;
		this.countryOfOrigin = countryOfOrigin;
		this.minStock = minStock;
	}
}
