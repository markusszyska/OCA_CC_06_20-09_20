package ml.schulzke;

public class Adress {
	// Attribute
	private String name = "Surname";
	private String fname = "Firstname";
	private String sname = "Hellostreet 1";
	private int hnumber = 00;
	private int zcode = 0123456;
	private String city = "ExampleCity";
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFname() {
		return this.fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getSname() {
		return this.sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getHnumber() {
		return this.hnumber;
	}
	
	public void setHnumber(int hnumber) {
		this.hnumber = hnumber;
	}
	
	public int getZcode() {
		return this.zcode;
	}
	
	public void setZcode(int zcode) {
		this.zcode = zcode;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public Adress(String name, String fname, String sname, int hnumber, int zcode, String city) {
//		this(name,fname,sname,hnumber,zcode,city);
		this.setName(name);
		this.setFname(fname);
		this.setSname(sname);
		this.setHnumber(hnumber);
		this.setZcode(zcode);
		this.setCity(city);
	}
	
	public String printAddress() {
		return this.getName()+""+this.getFname()+""+this.getSname()+""+this.getHnumber()+""+this.getZcode()+""+this.getCity();
	}
	
	
}
