package zeitner.brennofensimulator_kaputt.brennstoff;

public abstract class Brennstoff implements IBrennbar{
	
	private String name;
	private int temperatureRaise;
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getTemperatureRaise() {
		return temperatureRaise;
	}

	private void setTemperatureRaise(int temperatureRaise) {
		this.temperatureRaise = temperatureRaise;
	}

	public Brennstoff(String name, int temperatureRaise) {
		super();
		this.setName(name);
		this.setTemperatureRaise(temperatureRaise);
	}
	
//	public int brennt(){
//		return this.getTemperatureRaise();
//	}
}
