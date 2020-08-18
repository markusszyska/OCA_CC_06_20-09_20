package de.comcave;

/**
 * Eager Singleton - Eifriges Singleton
 */
public class MySingleton {
 
	private final static MySingleton instance = new MySingleton();

	private String text;

	public static MySingleton getInstance() {
		return instance;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private MySingleton() {
		this.setText("default");
	}
}
