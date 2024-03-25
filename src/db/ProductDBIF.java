/**
* This is the interface for ProductDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface ProductDBIF {
	/**
	* This method finds a Product by its productNumber.
	* @param productNumber The productNumber of the Product.
	* @return Product The Product found with the given productNumber.
	*/
	public Product findByProductNumber(int productNumber);
}
