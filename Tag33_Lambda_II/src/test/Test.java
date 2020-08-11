package test;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		Predicate<Object> test1 = new Predicate<Object>() {
			@Override
			public boolean test(Object t) {
				// TODO Auto-generated method stub
				return false;
			}			
		};
		
		Predicate<Object> test2 = e -> true;
		
	}
	
}
