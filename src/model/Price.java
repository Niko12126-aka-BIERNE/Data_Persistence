import java.time.LocalDate;

/**
* This class represents a Price of a Product.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class Price {
	private LocalDate date;
	private double price;
	
	/**
	 * This is the constructor for the Price class.
	 * @param date The date that the Price is available from.
	 * @param price The price.
	 */
	public Price(LocalDate date, double price) {
		this.date = date;
		this.price = price;
	}

	//TODO: doucmentation here...
	public LocalDate getDate() {
		return date;
	}
	
	/**
	* This method gets the price.
	* @return double The price.
	*/
	public double getPrice() {
		return price;
	}
}
