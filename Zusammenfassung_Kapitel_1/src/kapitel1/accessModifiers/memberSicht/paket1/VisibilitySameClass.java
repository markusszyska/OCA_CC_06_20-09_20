package kapitel1.accessModifiers.memberSicht.paket1;

public class VisibilitySameClass {
	
	//Attribute mit unterschiedlichen Sichtbarkeiten
	private int privAttr = 1;
	int defAttr = 2;
	protected int protAttr = 3;
	public int pubAtt = 4;
	//Methoden mit unterschiedlichen Sichtbarkeiten
	private void privMethod() {
		
	}
	void defMethod() {
		
	}
	protected void protMethod() {
		
	}
	public void pubMethod() {
		
	}
	
	public void testAccess() {
//		//Zugriff ueber this
//		System.out.println(this.privAttr);
//		System.out.println(this.defAttr);
//		System.out.println(this.protAttr);
//		System.out.println(this.pubAtt);
//		//Zugriff auf die Methoden ueber this
//		this.privMethod();
//		this.defMethod();
//		this.protMethod();
//		this.pubMethod();
//		//Zugriff ueber eine Referenzvariable
//		VisibilitySameClass vClass = new VisibilitySameClass();
//		System.out.println(vClass.privAttr);
//		System.out.println(vClass.defAttr);
//		System.out.println(vClass.protAttr);
//		System.out.println(vClass.pubAtt);
//		
//		vClass.privMethod();
//		vClass.defMethod();
//		vClass.protMethod();
//		vClass.pubMethod();
		
	}
}
