/**
* <description>
* @author Nikolaj Andersen
* @version 27/03/2024
*/
public class Address {
  private int addressID;
	private String streetName;
	private int houseNumber;
	private int floorNumber;
	private int doorNumber;
	private String zipCode;
	private String cityName;

  /**
	* This is the constructor for the Address class.
	* @param streetName <description>
	* @param houseNumber <description>
	* @param floorNumber <description>
	* @param doorNumber <description>
	* @param zipCode <description>
	* @param cityName <description>
	*/
	public Address(int addressID, String streetName, int houseNumber, int floorNumber, int doorNumber, String zipCode, String cityName) {
    this.addressID = addressID;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.floorNumber = floorNumber;
		this.doorNumber = doorNumber;
		this.zipCode = zipCode;
		this.cityName = cityName;
	}

  //TODO: doucmentation here...
  public int getAddressID() {
    return addressID;
  }

  //TODO: doucmentation here...
  public String getStreetName() {
    return streetName;
  }

  //TODO: doucmentation here...
  public int getHouseNumber() {
    return houseNumber;
  }

  //TODO: doucmentation here...
  public int getFloorNumber() {
    return floorNumber;
  }

  //TODO: doucmentation here...
  public int getDoorNumber() {
    return doorNumber;
  }

  //TODO: doucmentation here...
  public String getZipCode() {
    return zipCode;
  }

  //TODO: doucmentation here...
  public String getCityName() {
    return cityName;
  }
}
