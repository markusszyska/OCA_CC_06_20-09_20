package ml.salastexido;

public class MotoCycle extends Vehicle {
	
	private String type = Const.MOTO;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @param type
	 */
	public MotoCycle() {
		super();
	}
	
	public void print() {
		String result="";
		result+="*******************************************";
		result+="\n******** MotoCycle Type: " + type  + " *******************";
		result+="\n******** MotoCycle Manufacturer: " + this.getManufacterName()  + " **************";
		result+="\n******** MotoCycle Price: " + this.getPreis() + " *********";
		System.out.println(result);
	}
	
	
	
}
