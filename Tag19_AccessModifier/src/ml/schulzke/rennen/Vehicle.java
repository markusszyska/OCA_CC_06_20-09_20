package ml.schulzke.rennen;

public class Vehicle {
	
	private String name;
	private double pos;
	private double speed;
	private double speedMax;
	private int wheels;
	
	public Vehicle() {
		this("unnamed",0,0,0,0);
	}
	
	public Vehicle(String name,double pos, double speed, double speedMax, int wheels) {
		this.name = name;
		this.pos = pos;
		if(speed>speedMax) {
			this.speed = speedMax;
		}else {
			this.speed = speed;
		}
		this.speedMax = speedMax;
		this.wheels = wheels;
	}
	
	
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "Name: " + this.getName() +"\n";
		ausgabe += "Geschwindigkeit: " + String.format("%.2f", this.getSpeed()) +"km/h\n";
		ausgabe += "Maximalgeschwindigkeit: " + String.format("%.2f", this.getSpeedMax()) +"km/h\n";
		ausgabe += "Strecke zurueckgelegt: " + String.format("%.2f", this.getPos()) +"km\n";
		if(this.getWheels()==0) {
		ausgabe += "Reifen: keine\n";
		}else {
		ausgabe += "Reifen: " + this.getWheels()+"\n";
		}
		return ausgabe;
	}
	
	public String rndTime(double length) {
		int seconds = (int) ((length/this.speed)*3600);
		
		String stunden = String.valueOf((seconds % 86400) / 3600);
		String minuten = String.valueOf(((seconds % 86400) % 3600) / 60);
		String sekunden = String.valueOf(((seconds % 86400) % 3600) % 60);
		if(minuten.length()==1) {
			minuten = "0"+minuten;
		}
		if(sekunden.length()==1) {
			sekunden = "0"+sekunden;
		}
		return "Rundendauer: "+stunden+":"+minuten+":"+sekunden;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public double getPos() {
		return pos;
	}

	public void setPos(int seconds) {
		this.pos = ((this.getSpeed()/3.6)*seconds)/1000;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if(speed>this.speedMax) {
			this.speed = this.speedMax;
		}else {
			this.speed = speed;
		}
		
	}

	public double getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(double speedMax) {
		this.speedMax = speedMax;
	}


	
	public void moveMin(double minutes) {
		
	}
	/*public void moveTrack(double minutes) {
		
	}*/
}

class Bicycle extends Vehicle {

	public Bicycle() {
		super("unnamed Bicycle",0,0,30,2);
	}
	public Bicycle(double speed) {
		super("unnamed Bicycle",0,speed,30,2);
	}

	public Bicycle(String name, double pos, double speed) {
		super(name, pos, speed, 30, 2);
	}

}

class Car extends Vehicle {

	public Car() {
		super("unnamed Car",0,0,140,4);
	}
	
	public Car(double speed) {
		super("unnamed Car",0,speed,140,4);
	}
	
	public Car(String name, double speed) {
		super(name,0,speed,140,4);
	}

	public Car(String name, double pos, double speed) {
		super(name, pos, speed, 140, 4);
	}

}

class Ambulance extends Car {
	
	boolean siren; 
	public boolean isSiren() {
		return siren;
	}
	public void setSiren(boolean siren) {
		this.siren = siren;
	}
	
	public Ambulance(double speed) {
		super("unnamed Ambulance", speed);
	}
	public Ambulance() {
		super();
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "Name: " + this.getName() +"\n";
		ausgabe += "Geschwindigkeit: " + this.getSpeed()+"km/h\n";
		ausgabe += "Maximalgeschwindigkeit: " + this.getSpeedMax()+"km/h\n";
		ausgabe += "Strecke zurueckgelegt: " + this.getPos()+"km\n";
		if(this.getWheels()==0) {
		ausgabe += "Reifen: keine\n";
		}else {
		ausgabe += "Reifen: " + this.getWheels()+"\n";
		}
		ausgabe += "Blaulicht: "+this.isSiren()+"\n";
		return ausgabe;
	}
	
}



class RacingCar extends Vehicle {

	public RacingCar() {
		super("unnamed Racing-Car",0,0,220,4);
	}
	
	public RacingCar(double speed) {
		super("unnamed Racing-Car",0,speed,220,4);
	}

	public RacingCar(String name, double pos, double speed) {
		super(name, pos, speed, 220, 4);
	}

}

class Enterprise extends Vehicle {

	public Enterprise() {
		super("USS Enterprise – NCC-1701-D",0,0,269280000,0);
	}
	
	public Enterprise(double speed) {
		super("USS Enterprise – NCC-1701-D",0,speed,269280000,0);
	}

	public Enterprise(String name, double pos, double speed) {
		super(name, pos, speed, 220, 4);
	}
	
	public String rndTime(double length) {
		double seconds = (length/this.getSpeed())*3600;
		return "Rundendauer: "+String.format("%.6f", seconds)+" Sekunden";
		
	}

}
