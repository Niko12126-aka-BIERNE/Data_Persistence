import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
* This class is the DAO for the Price database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class PriceDB implements PriceDBIF {
	private static final String findByProductNumberAndDateQ = "SELECT TOP 1 * FROM Prices WHERE fk_productID = ? AND date <= ? ORDER BY date DESC";
	private PreparedStatement findByProductNumberAndDatePreparedStatement;

	//TODO: Add documentation...
	public PriceDB() {
		Connection connection = DBConnection.getInstance().getConnection();

		try {
			findByProductNumberAndDatePreparedStatement = connection.prepareStatement(findByProductNumberAndDateQ);
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method builds the Price object from a ResultSet.
	* @param rs The ResultSet containing Price information.
	* @return Price The Price object build from the ResultSet.
	*/
	public Price buildObject(ResultSet rs) throws SQLException{
		Price price = new Price(
			rs.getDate("date").toLocalDate(),
			rs.getDouble("price")
		);

		return price;
	}

	@Override
	public Price findByProductNumberAndDate(int productNumber, LocalDate date) {
		Price price = null;

		try {
			findByProductNumberAndDatePreparedStatement.setInt(1, productNumber);
			findByProductNumberAndDatePreparedStatement.setDate(2, java.sql.Date.valueOf(date));
			ResultSet rs = findByProductNumberAndDatePreparedStatement.executeQuery();

			if (rs.next()) {
				price = buildObject(rs);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}

		return price;
	}
}
