/**
* This is a subclass of Product that represents a GunReplica Product.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class GunReplica extends Product {
	private double calibre;
	private String material;

	/**
	* This is the constructor for the GunReplica class.
	* @param productNumber The productNumber of the product.
	* @param name The name of the product.
	* @param barcode The barcode of the product.
	* @param countryOfOrigin The country of origin of the product.
	* @param minStock The minimum amount of stock of the product.
	* @param calibre The calibre of the GunReplica.
	* @param material The material of the GunReplica.
	*/
	public GunReplica(int productNumber, String name, String barcode, String countryOfOrigin, int minStock, double calibre, String material) {
		super(productNumber, name, barcode, countryOfOrigin, minStock);
		this.calibre = calibre;
		this.material = material;
	}
}
