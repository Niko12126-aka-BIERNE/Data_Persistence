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
	private Price price;

	/**
	* This is the constructor for the Product class.
	* @param productNumber The productNumber of the product.
	* @param name The name of the product.
	* @param barcode The barcode of the product.
	* @param countryOfOrigin The country of origin of the product.
	* @param minStock The minimum amount of stock of the product.
	* @param price The price for this product with a date attached.
	*/
	public Product(int productNumber, String name, String barcode, String countryOfOrigin, int minStock, Price price) {
		this.productNumber = productNumber;
		this.name = name;
		this.barcode = barcode;
		this.countryOfOrigin = countryOfOrigin;
		this.minStock = minStock;
		this.price = price;
	}

	/**
	* This method gets the product number.
	* @return int The productNumber of the Product.
	*/
	public int getProductNumber() {
		return productNumber;
	}

	/**
	* This method gets the price of the Product.
	* @return double The price of the Product.
	*/
	public double getProductPrice() {
		return price.getPrice();
	}

	//TODO: doucmentation here...
	public String getName() {
		return name;
	}

	//TODO: doucmentation here...
	public String getBarcode() {
		return barcode;
	}

	//TODO: doucmentation here...
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	//TODO: doucmentation here...
	public int getMinStock() {
		return minStock;
	}
}
