import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

/**
* This class is the DAO for the Price database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class PriceDB implements PriceDBIF {
	private String findByProductNumberAndDateQ;
	private PreparedStatement findByProductNumberAndDatePreparedStatement;

	/**
	* This method builds the Price object from a ResultSet.
	* @param rs The ResultSet containing Price information.
	* @return Price The Price object build from the ResultSet.
	*/
	public Price buildObject(ResultSet rs) {
		//TODO: Add logic for this method!
		return null;
	}

	@Override
	public Price findByProductNumberAndDate(int productNumber, LocalDate date) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findByProductNumberAndDate'");
	}
}
