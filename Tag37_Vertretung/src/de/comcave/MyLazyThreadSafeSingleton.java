package de.comcave;

public class MyLazyThreadSafeSingleton {

	private static MyLazyThreadSafeSingleton instance = null;

	private String text;
	 
	public static MyLazyThreadSafeSingleton getInstance() {
		synchronized (MyLazyThreadSafeSingleton.class) {
			if (instance == null) {
				instance = new MyLazyThreadSafeSingleton();
			}
		}

		return instance;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	private MyLazyThreadSafeSingleton() {
		setText("Lazy Default");
	}
	
	
	
}
