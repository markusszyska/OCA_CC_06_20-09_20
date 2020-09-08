package pizzabaecker.model.pizza;

public interface IIngredient {
	int getPrice(); // Preis in Cent  
	String getName();
	boolean isVegetable(); // ist vegetarisch?  
	boolean isHot(); // ist scharf?  
}
