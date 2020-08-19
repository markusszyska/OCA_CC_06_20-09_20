package demoAnnotations.methodenAnnotationen;

import java.lang.reflect.Method;

public class AnnotationZurLaufzeitVerwenden {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		/*
		 * Returns an array containing Method objects reflecting all the public methods
		 * of the class or interface represented by this Class object, including those
		 * declared by the class or interface andthose inherited from superclasses and
		 * super interfaces.
		 */
		Method[] methods = AnwendungMitAnnotation.class.getMethods();
		for(Method m : methods) {
			if(m.isAnnotationPresent(MeineNeueAnnotation.class)) {
				MeineNeueAnnotation a = m.getAnnotation(MeineNeueAnnotation.class);
				System.out.println("Methode: " + m.getName());
				System.out.println("meinIntParam: " + a.meinIntParam());
				System.out.println("meinStringParam: " + a.meinStrinParam());
				System.out.println("meinDefaultParam: " + a.meinDefaultParam());
				for(String s : a.meinDefaultArrParam()) {
					System.out.println(s);
				}
			}
		}
		
		Method m1 = System.out.getClass().getMethod("println");
		System.out.println(m1.getName());
	}
}
