/**
* This is the interface for AddressDB.
* @author Nikolaj Andersen
* @version 27/03/2024
*/
public interface AddressDBIF {
	/**
	* This method finds a Address by its addressID.
	* @param addressID The ID of the Address.
	* @return Address The Address found with the given ID.
	*/
	public Address findByAddressID(int addressID);
}
