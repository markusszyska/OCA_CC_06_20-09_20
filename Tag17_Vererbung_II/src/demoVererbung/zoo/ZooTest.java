package demoVererbung.zoo;

public class ZooTest {
	public static void main(String[] args) {
		System.out.println("-----------Animal-----------");
		Animal a = new Animal();
		a.bewegen();
		
		System.out.println("-----------Cat-----------");
		Cat c = new Cat();
		c.bewegen();
		c.maunzen();
		System.out.println("-----------Dog-----------");
		Dog d = new Dog();
		d.bewegen();
		d.bellen();
		System.out.println("-----------Fish-----------");
		Fish f = new Fish();
		f.bewegen();
		f.blubbern();
		
		//Complierzeit -> Laufzeit
		//Referenztyp -> Objekttyp
		Animal a1 = new Cat();
		a1.bewegen();
		//Referenztyp Animal kennt keine Methode maunzen();
//		a1.maunzen();
		Cat c1 = new Cat();
		c1.bewegen();
		c1.maunzen();
		
		Animal a2 = new Cat();//Upcast
		Cat c2 = (Cat)a2; //Downcast
		((Cat)a2).maunzen();
		
		
		Object[] objArray = new Object[5];
		objArray[0] = "Hallo";
		objArray[1] = c1;
		objArray[2] = d;
		
//		((Dog)objArray[1]).bellen();// Erzeugt eine ClassCastException
		Animal[] animalArray = new Animal[4];
		animalArray[0] = c; //Cat
		animalArray[1] = d;	//Dog
		animalArray[2] = f;	//Fish
		animalArray[3] = a;	//Animal
		
		for(Animal animal : animalArray) {
			System.out.println(animal.getClass().getSimpleName());
		}
		
		//Casting Refenztypen
		Animal a3 = new Cat();
		Dog d2 = (Dog)a3;
		d2.bellen();
		
		
	}
}
