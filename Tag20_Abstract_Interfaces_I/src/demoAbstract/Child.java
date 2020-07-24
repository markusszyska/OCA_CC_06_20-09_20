package demoAbstract;

public class Child extends AAbstrakteZwischenklasse implements IInterface{

		
	@Override
	public void anAabstractMethodInAbstractParent() {
		System.out.println("abstract Method overridden from parent");		
	}

	@Override
	public void anNonAbstractMethodInAbstractParent() {
		System.out.println("overridden re abstract method from parent");		
	}

	@Override
	public void aMethodInInterface() {
		
		
	}

	@Override
	public void anotherMethodInInterface() {
		// TODO Auto-generated method stub
		
	}

//	public void defaultMethodInInterface() {
//		System.out.println("Default Methode im Interface");
//	}

}
