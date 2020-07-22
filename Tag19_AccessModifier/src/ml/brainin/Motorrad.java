package ml.brainin;

public class Motorrad extends Fahrzeug{
	private String fahrzeugtyp = "Motorrad";
	public void print(){
		String ausgabe = "";
		ausgabe+= "\nfahrzeugtyp: "+fahrzeugtyp;
		ausgabe += "\nHerstellerName: "+ getHerstellerName();
		System.out.println(ausgabe);

	}
}