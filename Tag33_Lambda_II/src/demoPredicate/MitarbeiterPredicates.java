package demoPredicate;

import java.util.function.Predicate;

public class MitarbeiterPredicates {

	public static Predicate<Mitarbeiter> isErwachsenMaennlich(){
		//anonymes Objekt Version
//		Predicate <Mitarbeiter> pred = new Predicate<Mitarbeiter>() {
//			@Override
//			public boolean test(Mitarbeiter t) {
//				return t.getAlter()>=18 && t.getGeschlecht() == Geschlecht.M;
//			}
//			
//		};		
//		return pred;
		//Lambda Version
		return m -> m.getAlter() >= 18 && m.getGeschlecht() == Geschlecht.M;
	}
	
	public static Predicate<Mitarbeiter> isErwachsenWeiblich(){
		return m -> m.getAlter() >= 18 && m.getGeschlecht() == Geschlecht.W;
	}
	
	public static Predicate<Mitarbeiter> istAelterAls(int alter){
		return m -> m.getAlter() > alter;
	}
	
}
