package demoAnnotations.annotationen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

enum MyEnum {
	A, B, C
}

@Retention(RetentionPolicy.RUNTIME)
@interface Anno02 {
	/*
	 * Invalid type Object for the annotation attribute Anno02.o; only primitive
	 * type, String, Class, annotation, enumeration are permitted or 1-dimensional
	 * arrays thereof
	 */
	// primitive Datentypen
	int i();

	double d();

	// nur wenige Referenztypen
	String s();

	Class<?> c();

	MyEnum e();

	PluginVersion a();

//	Object o();
	// Arrays von den aufgelisteten Datentypen
	String[] arr();

}

@Anno02(i = 2, d = 2.0, s = "Hallo Welt", c = Integer.class, e = MyEnum.A, 
		a = @PluginVersion(major = 3, minor = 0), 
		arr = {"a", "b", "c" })
class MyClass02{}



public class Demo02_Unterstuetzte_Datentypen {
	public static void main(String[] args) {
		MyClass02 mc = new MyClass02();
		
		Anno02 anno02 = MyClass02.class.getAnnotation(Anno02.class);
		System.out.println(anno02.i());
		System.out.println(anno02.d());
		System.out.println("Plugin Major: " + anno02.a().major());
		
		for(String s: anno02.arr()) {
			System.out.println(s);
		}
		
		
	}
}
