package demoAnnotations.demoReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {

	public static void main(String[] args) throws Exception {

		Class<Person> persClass = Person.class;
		Field[] fields = persClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(i + " : " + fields[i].getName());
		}
		Person p = new Person("Max", "Mustermann", 30);

		fields[2].setInt(p, 100);
		System.out.println("Max neues Alter: " + p.age);
		fields[0].set(p, "Max geaenderter Vorname");
		System.out.println(p.firstName);

		/*
		 * ohne setAccessible(true)
		 * Exception in thread "main" java.lang.IllegalAccessException: Class
		 * demoAnnotations.demoReflection.DemoReflection can not access a member of
		 * class demoAnnotations.demoReflection.Person with modifiers "private"
		 */
		fields[1].setAccessible(true);
		fields[1].set(p, "Max geaenderter Nachname");
		System.out.println(p.getLastName());
		
		System.out.println("------------------------------------");
		Method[]methods = persClass.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
			if(m.getParameterCount()==0) {
				m.setAccessible(true);
				m.invoke(p);
			}else {
				m.setAccessible(true);
				m.invoke(p, "Hallo");
			}
			
			
		}
		System.out.println("---------------String------------------");
		Class<String> stringClass = String.class;
		String s = "Hallo";
		Field[] stringFields = stringClass.getDeclaredFields();
		for(Field m : stringFields) {
			System.out.println(m.getName());
		}
		
		stringFields[1].setAccessible(true);
		System.out.println(stringFields[1].getInt(s));
		stringFields[1].setInt(s, 100);
		System.out.println(stringFields[1].getInt(s));
		stringFields[0].setAccessible(true);
//		stringFields[0].set(new char[] {'a', 'b', 'c'}, s);
	
		Field[] fields2 = persClass.getDeclaredFields();
		fields2[3].setInt(persClass, 1000);
		System.out.println(Person.staticAttr);
		
	}

}
