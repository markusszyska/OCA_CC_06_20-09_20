package zeitner.brennofensimulator_kaputt;

import java.io.FileNotFoundException;

import zeitner.brennofensimulator_kaputt.brennstoff.IBrennbar;

public class Ofen {
	int temperatur;
	int maxTemperatur;
	String useable;
	boolean saftey;

	public boolean isSaftey() {
		return saftey;
	}

	public void setSaftey(boolean saftey) {
		this.saftey = saftey;
	}

	public String getUseable() {
		return useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
	}

	public int getTemperatur() {
		return temperatur;
	}

	public void setTemperatur(int temperatur) {
		if (temperatur <= this.getMaxTemperatur()) {
			this.temperatur = temperatur;
		} else {
			try {
				int a = 1/1;
				//throw new FileNotFoundException("Datei nicht da ...");
			} catch(ArithmeticException e) {
				throw new RuntimeException(e.getLocalizedMessage(), e);
			} 
//			catch(FileNotFoundException e) {
//				throw new RuntimeException(e.getLocalizedMessage(), e);
//			} 
			finally {
				System.out.println("Finallyblock abgearbeitet ...");
			}
			
			//throw new TemperaturException(temperatur);
		}
	}

	public int getMaxTemperatur() {
		return maxTemperatur;
	}

	private void setMaxTemperatur(int maxTemperatur) {
		this.maxTemperatur = maxTemperatur;
	}

	public Ofen(int temperatur){
		super();
		this.setMaxTemperatur(2000);
		this.setSaftey(true);
		this.setTemperatur(temperatur);
		this.setUseable("t");

	}

	public Ofen(){
		this(0);
	}

	@Override
	public String toString() {
		String stringOut = "";

		stringOut = "Aktuelle Temperatur im Ofen: \n" + "Temperatur: 		" + this.getTemperatur() + "°C\n"
				+ "Max Temperatur:		" + this.getMaxTemperatur() + "°C\n";

		return stringOut;

	}

	public void kuehlen()  {
		this.setTemperatur(this.getTemperatur() - 200);
		System.out.println("\n---Notfall-System---\n" + "Plasma Kuehlmittel wird eingeleitet!\n"
				+ "Aktuelle Temperatur im Warpkern sinkt um 200°C durch hinzugabe von \"Plasma Kuehlmittel\"! \n"
				+ "Temperatur: 		" + this.getTemperatur() + "°C\n");
		this.setSaftey(false);
	}
	
	public void verbrennen(IBrennbar brennbar) {
		if (this.getTemperatur() + brennbar.getTemperatureRaise() <= this.getMaxTemperatur()) {
			this.setTemperatur(this.getTemperatur()+brennbar.getTemperatureRaise());
		} else {
			if (this.isSaftey()) {
				this.kuehlen();
			}
			this.setTemperatur(this.getTemperatur() + brennbar.getTemperatureRaise());
		}
		
		
		
		System.out.println("Aktuelle Temperatur im Warpkern steigt um " + brennbar.getTemperatureRaise() 
		+ "°C durch hinzugabe von \"" + brennbar.getName() + "\"! \n" + "Temperatur: 		"
		+ this.getTemperatur() + "°C\n" + "Max Temperatur:		" + this.getMaxTemperatur() + "°C\n");

//
//		try {
//			if (this.getTemperatur() <= this.getMaxTemperatur()) {
//				this.setTemperatur(this.getTemperatur() + brennbar.getTemperatureRaise());
//				stringOut = "@ - Aktuelle Temperatur im Warpkern steigt um " + brennbar.getTemperatureRaise()
//		+ "°C durch hinzugabe von \"" + brennbar.getName() + "\"! \n" + "Temperatur: 		"
//		+ this.getTemperatur() + "°C\n" + "Max Temperatur:		" + this.getMaxTemperatur() + "°C\n";
//			    if (this.getTemperatur() >= this.getMaxTemperatur()) {
//					this.setUseable(null);
//				}
//			} else {
//				this.setUseable(null);
//			}
//			this.getUseable().toUpperCase();
//		} catch (Exception e) {
//			stringOut = "E - Aktuelle Temperatur im Warpkern steigt um " + brennbar.getTemperatureRaise()
//					+ "°C durch hinzugabe von \"" + brennbar.getName() + "\"! \n" + "Temperatur: 		"
//					+ this.getTemperatur() + "°C\n" + "Warpkern-Temperatur hat " + this.getMaxTemperatur()
//					+ "°C ueberschritten.\n";
//			if (this.isSaftey()) {
//				this.setTemperatur(this.getTemperatur() - 200);
//				stringOut += "\n---Notfall-System---\n" + "Plasma Kuehlmittel wird eingeleitet!\n"
//						+ "Aktuelle Temperatur im Warpkern sinkt um 200°C durch hinzugabe von \"Plasma Kuehlmittel\"! \n"
//						+ "Temperatur: 		" + this.getTemperatur() + "°C\n";
//				this.setSaftey(false);
//			}
//			if (this.getTemperatur() >= this.getMaxTemperatur()) {
//				stringOut += "Warpkern wurde zerstoert! \"fascinating\" - Leonard Nimoy\n";
//				System.out.println(stringOut);
//				this.explodieren();
//				System.exit(1);
//			} else {
//				this.setUseable("t");
//			}
//			//System.out.println(stringOut);
//
//		}
//
//		System.out.println(stringOut);
	}

	public void explodieren() {
		String[] intro = { "", "   _.-^^---....,,--__     ", " _--                  --_  ",
				"<                        >)", "|                         | ", " \\._                   _./  ",
				"    ```--. . , ; .--'''       ", "          | |   |       ", "       .-=||  | |=-.   ",
				"       `-=#$%&%$#=-'   ", "          | ;  :|     		", " _____.,-#%&$@%#&#~,._____" };

		for (String entry : intro) {
			try {
				Thread.sleep(180);
			} catch (InterruptedException e) {
				// /ignore
			}
			System.out.println(entry);
		}
	}
}
