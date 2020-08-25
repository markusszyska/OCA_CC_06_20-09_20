package kapitel1.accessModifiers.memberSicht.paket4.sub2;

import kapitel1.accessModifiers.memberSicht.paket4.sub1.VisibilityOutsidePackage;

public class SubClassOutsidePackage extends VisibilityOutsidePackage {

	public void testAccess() {
		// Zugriff ueber this
//		System.out.println(this.privAttr);
//		System.out.println(this.defAttr);
		System.out.println(this.protAttr);
		System.out.println(this.pubAtt);
		
//		//Zugriff auf die Methoden ueber this
//		this.privMethod();
//		this.defMethod();
		this.protMethod();
		this.pubMethod();
		
//		//Zugriff ueber eine Referenzvariable
		VisibilityOutsidePackage vClass = new VisibilityOutsidePackage();
//		System.out.println(vClass.privAttr);
//		System.out.println(vClass.defAttr);
//		System.out.println(vClass.protAttr);
		System.out.println(vClass.pubAtt);
//		
//		vClass.privMethod();
//		vClass.defMethod();
//		vClass.protMethod();
		vClass.pubMethod();
		
		SubClassOutsidePackage sClass = new SubClassOutsidePackage();
		sClass.protMethod();
		System.out.println(sClass.protAttr);
	}
	
}
