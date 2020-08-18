package de.comcave;

public class MyLazySingleton {

	private static MyLazySingleton instance = null;

	private String text;
	
	public static MyLazySingleton getInstance() {
		if(instance == null) {
			instance = new MyLazySingleton();
		}
		return instance;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	private MyLazySingleton() {
		setText("Lazy Default");
	}
	
	
	
}
