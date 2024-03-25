/**
* This is a subclass of Product that represents a Equipment Product.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Equipment extends Product {
	private String type;
	private String description;

	/**
	* This is the constructor for the Equipment class.
	* @param productNumber The productNumber of the product.
	* @param name The name of the product.
	* @param barcode The barcode of the product.
	* @param countryOfOrigin The country of origin of the product.
	* @param minStock The minimum amount of stock of the product.
	* @param type The type of the Equipment.
	* @param description The description of the Equipment.
	*/
	public Equipment(int productNumber, String name, String barcode, String countryOfOrigin, int minStock, String type, String description) {
		super(productNumber, name, barcode, countryOfOrigin, minStock);
		this.type = type;
		this.description = description;
	}
}
