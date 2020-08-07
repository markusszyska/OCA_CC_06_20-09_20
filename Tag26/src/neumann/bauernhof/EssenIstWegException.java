package neumann.bauernhof;

public class EssenIstWegException extends RuntimeException {

	private int anzahl;
	
	
	
	public int pflanzenZaehlen() {
		return anzahl;
	}

	public EssenIstWegException() {
		super("Alles aufgefressen....");
		// TODO Auto-generated constructor stub
	}

	public EssenIstWegException(Throwable cause) {
		super("Alles aufgefressen....");
		
	}

	public EssenIstWegException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public EssenIstWegException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
