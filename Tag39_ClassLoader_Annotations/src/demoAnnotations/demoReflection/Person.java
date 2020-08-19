package demoAnnotations.demoReflection;

public class Person {
	public String firstName;
	private String lastName;
	public int age;
	public static int staticAttr = 0;
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	private void meinePrivateMethode() {
		System.out.println("Hier kommt keiner ran");
	}
	
	private void meinePrivateMethode(String s) {
		System.out.println("Hier kommt keiner ran " + s);
	}
}
