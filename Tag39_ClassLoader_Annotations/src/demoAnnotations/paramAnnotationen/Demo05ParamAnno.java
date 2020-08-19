package demoAnnotations.paramAnnotationen;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo05ParamAnno {

	public void methodWithParamAnno(@MyParamAnno(i = 100) Integer zahl) {
		
	}
	
	public void methodWithPrimParam(@MyParamAnno int zahl) {
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
//		MyParamAnno mpa = (MyParamAnno)Demo05ParamAnno.class.getMethod("methodWithParamAnno", Integer.class).getParameterAnnotations()[0][0];
		Method m = Demo05ParamAnno.class.getMethod("methodWithParamAnno", Integer.class);
		Annotation[][] annoArr = m.getParameterAnnotations();
		System.out.println(annoArr[0]);
		System.out.println(annoArr[0][0]);
		MyParamAnno mpa = (MyParamAnno)annoArr[0][0];
		System.out.println(mpa.i());
		
		Method m1 = Demo05ParamAnno.class.getMethod("methodWithPrimParam", int.class);
		System.out.println(int.class);
		MyParamAnno mpa2 = (MyParamAnno)m1.getParameterAnnotations()[0][0];
		System.out.println(mpa2.i());
	}
	
	
	
}
