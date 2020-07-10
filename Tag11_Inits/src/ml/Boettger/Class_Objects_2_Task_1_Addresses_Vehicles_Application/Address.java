package ml.Boettger.Class_Objects_2_Task_1_Addresses_Vehicles_Application;

public class Address {
	private String first_name;
	private String surname;
	private String street_name;
	private String house_number;
	private String postcode;
	private String place_name;
	
	public String getFirst_name()
	{
		return first_name;
	}
	
	public void setFirst_name(String first_name)
	{
		this.first_name = first_name;
	}
	
	public String getSurname() 
	{
		return surname;
	}
	
	public void setSurname(String surname) 
	{
		this.surname = surname;
	}
	
	public String getStreet_name() 
	{
		return street_name;
	}
	
	public void setStreet_name(String street_name) 
	{
		this.street_name = street_name;
	}
	
	public String getHouse_number()
	{
		return house_number;
	}
	
	public void setHouse_number(String house_number) 
	{
		this.house_number = house_number;
	}
	
	public String getPostcode() 
	{
		return postcode;
	}
	
	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}
	
	public String getPlace_name() 
	{
		return place_name;
	}
	
	public void setPlace_name(String place_name)
	{
		this.place_name = place_name;
	}
	
	public String toString()
	{
		return "Address [first_name=" +	this.getFirst_name() + 
				", surname =" + this.getSurname() + 
				", street_name =" + this.getStreet_name() + 
				", house_number =" + this.getHouse_number() + 
				", postcode =" + this.getPostcode() + 
				", place_name =" + this.getPlace_name() + "]";
	}
	
	public Address() 
	{
		this("Max");
	}
	
	public Address(String first_name)
	{
		this(first_name, "Mustermann");
	}
	
	public Address(String first_name, String surname)
	{
		this(first_name, surname, "street name");		
	}
	
	public Address(String first_name, String surname, String street_name)
	{
		this(first_name, surname, street_name, "1");		
	}
	
	public Address(String first_name, String surname, String street_name,
			String house_number)
	{
		this(first_name, surname, street_name, house_number, "12345");		
	}	
	
	public Address(String first_name, String surname, String street_name,
			String house_number, String postcode)
	{
		this(first_name, surname, street_name, house_number, postcode,
			"Berlin");
	}	
	
	public Address(String first_name, String surname, String street_name,
			String house_number, String postcode, String place_name)
	{		
		this.setFirst_name(first_name);
		this.setSurname(surname);
		this.setStreet_name(street_name);
		this.setHouse_number(house_number);
		this.setPostcode(postcode);
		this.setPlace_name(place_name);		
	}	
	
	public void printAddress()
	{
		System.out.println();
		System.out.println(
			"\t" +	
			"<" + this.getFirst_name() + ">" +
			"<" + this.getSurname()	+ ">" +
			"<" + this.getStreet_name() + ">" +
			"<" + this.getHouse_number() + ">" +
			"<" + this.getPostcode() + ">" +
			"<" + this.getPlace_name() + ">");
		System.out.println();
	}
}
