package kapitel1.accessModifiers.memberSicht.paket4.sub2;

public class AClass {

	void go() {
		SubClassOutsidePackage sClass = new SubClassOutsidePackage();
//		sClass.protMethod();
//		System.out.println(sClass.protAttr);
	}
}
