import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
* This class is the DAO for the Product database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class ProductDB implements ProductDBIF {
	private String findByProductNumberQ;
	private PreparedStatement findByProductNumberPreparedStatement;

	/**
	* This method builds the Product object from a ResultSet.
	* @param rs The ResultSet containing Product information.
	* @return Product The Product object build from the ResultSet.
	*/
	public Product buildObject(ResultSet rs) {
		//TODO: Add logic for this method!
		return null;
	}

	@Override
	public Product findByProductNumber(int productNumber) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findByProductNumber'");
	}
}
