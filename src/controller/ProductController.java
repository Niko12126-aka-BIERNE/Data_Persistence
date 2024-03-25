/**
* This is the controller for the Product class.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class ProductController {
	private ProductDBIF productDB;

	/**
	* This is the constructor for the ProductController class.
	*/
	public ProductController() {
		this.productDB = new ProductDB();
	}

	/**
	* This method finds a Product by its productNumber.
	* @param productNumber The productNumber of the Product.
	* @return Product The Product found with the given productNumber.
	*/
	public Product findProductByProductNumber(int productNumber) {
		//TODO: Add logic for this method!
		return null;
	}
}
