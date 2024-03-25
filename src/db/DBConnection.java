import java.sql.Connection;
import java.sql.PreparedStatement;

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
		//TODO: Add logic for this method!
	}

	/**
	* This static method returns an instance of DBConnection.
	* @return DBConnection The instans of DBConnection.
	*/
	public static DBConnection getInstance() {
		//TODO: Add logic for this method!
		return null;
	}

	/**
	* This method starts a transaction.
	*/
	public void startTransaction() {
		//TODO: Add logic for this method!
	}

	/**
	* This method commits the transaction if one is started.
	*/
	public void commitTransaction() {
		//TODO: Add logic for this method!
	}

	/**
	* This method rolls back a transaction.
	*/
	public void rollbackTransaction() {
		//TODO: Add logic for this method!
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
		//TODO: Add logic for this method!
	}

	/**
	* This method executes a prepared statement and returns its identity.
	* @param preparedStatement The prepared statement to execute.
	* @return int The identity.
	*/
	public int executeInsertWithIdentity(PreparedStatement preparedStatement) {
		//TODO: Add logic for this method!
		return -1;
	}
}
