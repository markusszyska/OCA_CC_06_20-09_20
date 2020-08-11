package demoPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static demoPredicate.MitarbeiterPredicates.*;
public class DemoMitarbeiterPredicates {

	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter(1, 30, Geschlecht.M, "Rick", "Beethoven");
		Mitarbeiter m2 = new Mitarbeiter(2, 13, Geschlecht.W, "Martina", "Hengis");
		Mitarbeiter m3 = new Mitarbeiter(3, 42, Geschlecht.M, "Ricky", "Martin");
		Mitarbeiter m4 = new Mitarbeiter(4, 26, Geschlecht.M, "Jon", "Doe");
		Mitarbeiter m5 = new Mitarbeiter(5, 19, Geschlecht.W, "Christine", "Meyer");
		Mitarbeiter m6 = new Mitarbeiter(6, 15, Geschlecht.M, "David", "Schulze");
		Mitarbeiter m7 = new Mitarbeiter(7, 68, Geschlecht.W, "Sophia", "Lehmann");
		Mitarbeiter m8 = new Mitarbeiter(8, 79, Geschlecht.M, "Alex", "Lehmann");
		Mitarbeiter m9 = new Mitarbeiter(9, 15, Geschlecht.W, "Julia", "Roy");
		Mitarbeiter m10 = new Mitarbeiter(10, 45, Geschlecht.M, "Simon", "Mueller");

		// Array von Mitarbeitern erstellen
		Mitarbeiter[] mArray = new Mitarbeiter[] { m1, m2, m3, m4, m5, m6, m7, m8, m9, m10 };

		// Neue ArrayList erstellen
		ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();

		// ArrayList fuellen
		mitarbeiter.addAll(Arrays.asList(mArray));

		System.out.println(mitarbeiter);
		System.out.println("--------------------------------------------");

		ArrayList<Mitarbeiter> gefiltert;
		
		gefiltert = filterMitarbeiter(mitarbeiter,isErwachsenMaennlich() );
		System.out.println(gefiltert);
		System.out.println("--------------------------------------------");
		gefiltert = filterMitarbeiter(mitarbeiter, isErwachsenWeiblich());
		System.out.println(gefiltert);
		System.out.println("--------------------------------------------");
		gefiltert = filterMitarbeiter(mitarbeiter, istAelterAls(30));
		System.out.println(gefiltert);
		System.out.println("--------------------------------------------");
		
		System.out.println("---------------------negate()-----------------------");
		System.out.println(filterMitarbeiter(mitarbeiter, istAelterAls(30).negate()));
		System.out.println("---------------------and()-----------------------");
		System.out.println(filterMitarbeiter(mitarbeiter, 
				isErwachsenWeiblich().and(istAelterAls(30).negate()).negate().and(isErwachsenMaennlich())));
		System.out.println("---------------------or()-----------------------");
		System.out.println(filterMitarbeiter(mitarbeiter, isErwachsenMaennlich().or(istAelterAls(30))));
		
		
		boolean bool = isErwachsenMaennlich().or(istAelterAls(30)).test(m10);
		boolean bool2 = isErwachsenMaennlich().test(m10);
		
		System.out.println("--------------------------------------------");
		Predicate<Mitarbeiter> pred = m -> m.getAlter() > 30; 
		System.out.println(pred.test(m10));
		System.out.println(pred.negate().test(m10));
		
		Predicate<Mitarbeiter> pred2 = pred.negate();
		pred2.test(m10);
		
		Predicate<Mitarbeiter> pred3 = new Predicate<Mitarbeiter>() {
			@Override
			public boolean test(Mitarbeiter t) {
				return false;
			}			
		}.negate();
		pred3.test(m10);
		
		System.out.println("---------------------Stream ausblick auf OCP----------------------");
		Stream<Mitarbeiter> mitarbeiterStream = mitarbeiter.stream();
		mitarbeiterStream.filter(isErwachsenMaennlich()).forEach(System.out::println);;
				
	}

	public static ArrayList<Mitarbeiter> filterMitarbeiter(ArrayList<Mitarbeiter> mitarbeiter, 
			Predicate<Mitarbeiter> lambdaExp) {
		ArrayList<Mitarbeiter> result = new ArrayList<Mitarbeiter>();
		for(Mitarbeiter m : mitarbeiter)
			if(lambdaExp.test(m))
				result.add(m);
		return result;
	}

}
