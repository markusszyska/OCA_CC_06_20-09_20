package de.comcave;

public class Applikation {

	public static void main(String[] args) {
		MySingleton ms01 = MySingleton.getInstance();     
		System.out.println(ms01.getText());//default
		ms01.setText("Hallo Welt");  
		System.out.println(ms01.getText());//Hallo Welt
		
		MySingleton ms02 = MySingleton.getInstance();
		System.out.println(ms02.getText());//Hallo Welt
		System.out.println("-----");
		System.out.println(ms01.hashCode());
		System.out.println(ms02.hashCode());
		
		System.out.println("----------------");
		MyLazySingleton ml01 = MyLazySingleton.getInstance();
		System.out.println(ml01.getText());//Lazy Default
		ml01.setText("Hier ist Java");
		System.out.println(ml01.getText());//Hier ist Java
		
		MyLazySingleton ml02 = MyLazySingleton.getInstance();
		System.out.println(ml02.getText());//Hier ist Java
		System.out.println("-----");
		System.out.println(ml01.hashCode());
		System.out.println(ml02.hashCode());
	}

}
