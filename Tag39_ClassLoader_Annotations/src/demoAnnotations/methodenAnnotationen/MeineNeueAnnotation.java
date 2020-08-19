package demoAnnotations.methodenAnnotationen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MeineNeueAnnotation {
	int meinIntParam();

	String meinStrinParam();

	String meinDefaultParam() default "abc";

	String[] meinDefaultArrParam() default { "a", "b", "c" };

}
