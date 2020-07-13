package ml.salastexido;

public class Address {
	private String firstName;
	private String lastName;
	private String nameStreet;
	private String hausNumber;
	private int postCode;
	private String placeName;
	
	public Address(String firstName, String lastName, String nameStreet, String hausNumber, int postCode,
			String placeName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nameStreet = nameStreet;
		this.hausNumber = hausNumber;
		this.postCode = postCode;
		this.placeName = placeName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNameStreet() {
		return nameStreet;
	}

	public void setNameStreet(String nameStreet) {
		this.nameStreet = nameStreet;
	}

	public String getHausNumber() {
		return hausNumber;
	}

	public void setHausNumber(String hausNumber) {
		this.hausNumber = hausNumber;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	
	public String printAddress() {
		return  this.firstName +" , "  + this.nameStreet +", " + this.hausNumber + ", " +  this.postCode + ", "  + this.placeName;
	}
	

}
