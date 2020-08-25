package demoLogging.pak1.pak2;

import java.util.logging.Logger;

public class DemoParentLogger {

	
	public static void main(String[] args) {
		
		Logger l1 = Logger.getLogger("demoLogging.pak1.pak2");
		System.out.println(l1.getName());
		Logger l2 = Logger.getLogger("demoLogging.pak1");
		System.out.println(l2.getName());
		
		System.out.println("-------------------------");
		System.out.println(l1.getParent().getName());
				
	}
	
	
}
