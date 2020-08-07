package zeitner.brennofensimulator_kaputt;

public class TemperaturException extends RuntimeException {

	private int temperatur;
	
	public int getTemperatur() {
		return this.temperatur;
	}

	private void setTemperatur(int temperatur) {
		this.temperatur = temperatur;
	}

	public TemperaturException() {
		super("Temperatur zu hoch !");
	}

	public TemperaturException(int temperatur) {
		super("Temperatur zu hoch !");
		this.setTemperatur(temperatur);
	}
	
	public TemperaturException(String message) {
		super(message);
	}

	public TemperaturException(Throwable cause) {
		super("Temperatur zu hoch !",cause);
	}

	public TemperaturException(String message, Throwable cause) {
		super(message, cause);
	}

	public TemperaturException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
