package demoAnnotations.annotationen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno03{
	int i() default 0;
}

@Anno03 //i = 0;
class MyClass03{
	
}
@Anno03(i = 10)//i = 10
class MyClass03_a{
	
}
public class Demo03_Default {

	public static void main(String[] args) {
		Anno03 an1 = MyClass03.class.getAnnotation(Anno03.class);
		System.out.println(an1.i());
		Anno03 an2 = MyClass03_a.class.getAnnotation(Anno03.class);
		System.out.println(an2.i());
	}
	
	
}
