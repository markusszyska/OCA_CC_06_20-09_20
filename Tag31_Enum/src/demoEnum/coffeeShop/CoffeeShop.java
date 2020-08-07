package demoEnum.coffeeShop;

public class CoffeeShop {
	public static void main(String[] args) {
//		Cannot instantiate the type CupSize
//		CupSize size = new CupSize();
		
		Coffee c = new Coffee();
		//Standardwert fuer enum ist null
		System.out.println(c.getSize());
		
		c.setSize(CupSize.MEDIUM);
		System.out.println(c.getSize());
		
		System.out.println(c.getSize() == CupSize.MEDIUM);
		
		System.out.println("-----------------------");
		System.out.println("Wir bieten die Groessen: ");
		for(CupSize size : CupSize.values()) {
			System.out.println(size);
		}
		
		CupSize[] sizes = CupSize.values();
		for (int i = 0; i < sizes.length; i++) {
			System.out.println(sizes[i].ordinal());
		}
		for (int i = 0; i < CupSize.values().length; i++) {
			System.out.println(CupSize.values()[i].ordinal());
		}
		
		System.out.println("--------------ordinal()--------------");
		System.out.println(CupSize.SMALL.ordinal());
		System.out.println(CupSize.MEDIUM.ordinal());
		System.out.println(CupSize.LARGE.ordinal());
		
		System.out.println("--------------name()--------------");
		System.out.println(CupSize.SMALL.name());
		System.out.println(CupSize.MEDIUM.name());
		System.out.println(CupSize.LARGE.name());
		
		
	}
}
