package demoAnnotations.annotationen;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno04{
	String value(); //Ein besonderer Name value ermoeglicht eine vereinfachte Notation	
	int i() default 0;
}
@Anno04("abc") //die vereinfachte Notation nur fuer das Attribut mit dem Bezeichner "value"
class MyClass04{}

@Anno04(value = "abc")
class MyClass04_a{}

@Anno04(value = "abc", i = 10)
class MyClass04_b{}

//@Anno04("abc", i = 10)
class MyClass04_c{}

public class Demo04_Value {

}
