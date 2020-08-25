package demoProperties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {

	public static void main(String[] args) {
//		demoSystemProperties();
//		writeProperties();
		readProperties();
	}

	public static void readProperties() {
		File file = new File("MyProperties.properties");
		if(file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				Properties prop = new Properties();
				prop.load(br);
				Set<Object> alleKeys = prop.keySet();
				System.out.println("--------------------");
				for(Object key: alleKeys) {
					System.out.println(key + " = " + prop.get(key));
				}
				System.out.println("--------------------");
				prop.forEach((key, value)->{
					System.out.print("Key: " + key);
					System.out.println(" = Value: " + value);
				});
								
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
		
	public static void writeProperties() {
		File file = new File("MyProperties.properties");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			Properties prop = new Properties();
			
			//Properties definieren
			prop.setProperty("db.url", "localhost");
			prop.setProperty("db.user", "username");
			prop.setProperty("db.password", "ein Passwort");
			//Properties in eine Datei schreiben
			prop.store(bw, "ein Kommentar");
			System.out.println("Properties: "+ prop);
			prop.list(System.out);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	
	
	
	public static void demoSystemProperties() {
		System.out.println("-----------------System--------------------");
		// Determines the current system properties.
		System.out.println(System.getProperties());
		/*
		 * The Properties class represents a persistent set of properties. The
		 * Properties can be saved to a stream or loaded from a stream. Each key and its
		 * corresponding value in the property list is a string.
		 */
		Properties prop = System.getProperties();
		Set<Object> alleKeys = prop.keySet();

		System.out.println("Key = Value");
		for (Object refObj : alleKeys) {
			System.out.print(refObj + " = ");
			System.out.println(prop.getProperty(refObj.toString()));
		}

		System.setProperty("Mein Key", "Mein Wert");
		System.out.println("Meine Propertie : " + System.getProperty("Mein Key"));
		System.setProperty("java.version", "Ueberschriebene Java Version");
		System.out.println(System.getProperty("java.version"));

		File file = new File(System.getProperty("user.home"));
		System.out.println(file);

		System.out.println("Freie GB: " + Math.round(file.getFreeSpace() / (1024 * 1024 * 1024)));
		System.out.println("Komplette GB: " + Math.round(file.getTotalSpace() / (1024 * 1024 * 1024)));

		String path = "C:" + File.separator;
		for (String s : new File(path).list()) {
			System.out.println("Datei: " + s);
			File f = new File(path + s);
			if (f.isFile()) {
				System.out.println(" ist eine Datei");
			} else {
				System.out.println(" ist keine Datei");
			}
			if (f.isDirectory()) {
				System.out.println(" ist ein Verzeichnis");
			} else {
				System.out.println(" ist kein Verzeichnis");
			}
			if (f.canWrite()) {
				System.out.println(" ist nicht schreibgeschuetzt");
			} else {
				System.out.println(" ist schreibgeschuetzt");
			}

		}
		System.out.println("-----------------getEnv()-----------------------");
		/*
		 * Returns an unmodifiable string map view of the current system environment.The
		 * environment is a system-dependent mapping from names to values which is passed
		 * from parent to child processes.
		 * 
		 * If the system does not support environment variables, anempty map is
		 * returned. 
		 */
		Map<String, String> env = System.getenv();
		env.entrySet().forEach(System.out::println);
	}
}
