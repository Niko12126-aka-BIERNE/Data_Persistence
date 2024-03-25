import java.time.LocalDate;

/**
* This is the interface for PriceDB.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public interface PriceDBIF {
	/**
	* This method finds a Price of a Product by a product number and a date.
	* @param productNumber the product number of the Product.
	* @param date The date from witch the price of the Product is wanted.
	* @return Price The Price found with the given productNumber and date.
	*/
	public Price findByProductNumberAndDate(int productNumber, LocalDate date);
}
