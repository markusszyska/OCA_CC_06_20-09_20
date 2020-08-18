package demoSystemRuntime;

import java.util.Map;

public class DemoSystemRuntime {

	public static void main(String[] args) {
//		demoRuntime();
		demoSystem();
	}

	private static void demoSystem() {
		
		Map<String, String> env = System.getenv();
		System.out.println(env.get("HOMEPATH"));
		env.forEach((key, value)-> {
			System.out.println("key: " + key + " " + value);
		});
		
		
		
		
	}

	private static void demoRuntime() {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Verfügbare Prozessoren: " + rt.availableProcessors());
		System.out.println("Runtime Total Memory  : " + rt.totalMemory()/(1024*1024) + " MB");
		System.out.println("Runtime Max Memory    : " + rt.maxMemory()/(1024*1024) + " MB");
		System.out.println("Runtime Free Memory   : " + rt.freeMemory()/(1024*1024) + " MB");
		
		
	}
	
	
	
}
