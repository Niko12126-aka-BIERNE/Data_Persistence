import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* This singleton class is the Connection for the database.
* @author Nikolaj Andersen
* @version 25/03/2024
*/
public class DBConnection {
	private Connection connection;
	private static DBConnection dbConnection;

	private static final String driverClass = ""; //TODO: Create a private file with this value. "DO NOT!!!" push to git.
	private static final String dbName = ""; //TODO: Create a private file with this value. "DO NOT!!!" push to git.
	private static final String serverAddress = ""; //TODO: Create a private file with this value. "DO NOT!!!" push to git.
	private static final String serverPort = ""; //TODO: Create a private file with this value. "DO NOT!!!" push to git.
	private static final String userName = ""; //TODO: Create a private file with this value. "DO NOT!!!" push to git.
	private static final String password = ""; //TODO: Create a private file with this value. "DO NOT!!!" push to git.

	/**
	* This is the constructor for the DBConnection class.
	*/
	private DBConnection() {
		String connectionString = String.format(
					"jdbc:sqlserver://%s:%d;databaseName=%s;user=%s;password=%s;encrypt=false",
					serverAddress,
					serverPort,
					dbName,
					userName,
					password
				);
		try {
			Class.forName(driverClass);
			connection = DriverManager.getConnection(connectionString);
		} catch (ClassNotFoundException e) {
			//TODO: Handle exception...
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This static method returns an instance of DBConnection.
	* @return DBConnection The instans of DBConnection.
	*/
	public static DBConnection getInstance() {
		if (dbConnection == null) {
			dbConnection = new DBConnection();
		}

		return dbConnection;
	}

	/**
	* This method starts a transaction.
	*/
	public void startTransaction() {
		try {
			try {
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				//TODO: Handle exception...
			} finally {
				connection.setAutoCommit(true);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method commits the transaction if one is started.
	*/
	public void commitTransaction() {
		try {
			connection.commit();
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method rolls back a transaction.
	*/
	public void rollbackTransaction() {
		try {
			try {
				connection.rollback();
			} catch (SQLException e) {
				//TODO: Handle exception...
			} finally {
				connection.setAutoCommit(true);
			}
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method gets the connection.
	* @return Connection The connection.
	*/
	public Connection getConnection() {
		return connection;
	}

	/**
	* This method disconnects from the database.
	*/
	public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			//TODO: Handle exception...
		}
	}

	/**
	* This method executes a prepared statement and returns its identity.
	* @param preparedStatement The prepared statement to execute.
	* @return int The identity.
	* @throws SQLException 
	*/
	public int executeInsertWithIdentity(PreparedStatement preparedStatement) throws SQLException {
		int res = -1;
		try {
			res = preparedStatement.executeUpdate();
			if(res > 0) {
				ResultSet rs = preparedStatement.getGeneratedKeys();
				rs.next();
				res = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		return res;
	}
}
