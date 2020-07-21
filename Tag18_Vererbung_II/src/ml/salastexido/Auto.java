package ml.salastexido;

public class Auto extends Vehicle {
	
	private String modelName;
	private String type = Const.AUTO;
	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}
	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
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
	 * @param modelName
	 * @param type
	 */
	public Auto() {
		super();
		System.out.print("Enter the Auto Model Name: ");
		modelName = scanner.next();
	}
	
	public void print() {
		String result="";
		result+="*******************************************";
		result+="\n******** Auto Model: " + modelName + " *************";
		result+="\n******** Auto Type: " + type  + " *******************";
		result+="\n******** Auto Manufacturer: " + this.getManufacterName()  + " *******************";
		result+="\n******** Auto Price: " + this.getPreis() + " *********";
		System.out.println(result);
		
	}
	
	
	

}
