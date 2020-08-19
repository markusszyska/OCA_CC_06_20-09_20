package demoAnnotations.methodenAnnotationen;

import java.lang.reflect.Method;

public class AnwendungMitAnnotation {

	@MeineNeueAnnotation(
			meinIntParam = 1,
			meinStrinParam = "Hallo Welt",
			meinDefaultArrParam = {"Reflection", "ist", "toll!"}
			)
	public void meineMethodeMitAnnotation() throws Exception{
		Method m = this.getClass().getMethod("meineMethodeMitAnnotation");
		MeineNeueAnnotation anno = m.getAnnotation(MeineNeueAnnotation.class);
		System.out.println(anno.meinStrinParam());
		for(String s: anno.meinDefaultArrParam()) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) throws Exception {
		AnwendungMitAnnotation ama = new AnwendungMitAnnotation();
		ama.meineMethodeMitAnnotation();
	}
	
}
