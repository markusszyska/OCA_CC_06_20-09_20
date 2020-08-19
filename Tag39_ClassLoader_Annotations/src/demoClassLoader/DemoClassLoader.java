package demoClassLoader;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class DemoClassLoader {
	/*
	 * Eine Klasse in Java wird durch ihren voll qualifizierten Namen und dem
	 * ClassLoader, der sie geladen hat identifiziert.
	 * 
	 * Daher ist es moeglich, dass mehrere Klassen mit dem selben Namen in einer
	 * VM gleichzeitig existieren, solange sie von unterschiedlichen Classloadern 
	 * geladen wurden. Zwei Klassen, die mit verschiedenen Classloadern geladen wurden
	 * sind von unterschiedlichen Typen, also inkompatibel, selbst wenn sie vom
	 * selben Class File geladen wurden.
	 */

	public static void main(String[] args) throws Exception {

		/*
		 * Bootstrap Class Loader: It loads standard JDK class files from rt.jar and
		 * other core classes. It is a parent of all class loaders. It doesn't have any
		 * parent. When we call String.class.getClassLoader() it returns null, and any
		 * code based on it throws NullPointerException. It is also called Primordial
		 * ClassLoader. It loads class files from jre/lib/rt.jar. For example, java.lang
		 * package class.
		 * 
		 * Extensions Class Loader: It delegates class loading request to its parent. If
		 * the loading of a class is unsuccessful, it loads classes from jre/lib/ext
		 * directory or any other directory as java.ext.dirs. It is implemented by
		 * sun.misc.Launcher$ExtClassLoader in JVM.
		 * 
		 * System Class Loader: It loads application specific classes from the CLASSPATH
		 * environment variable. It can be set while invoking program using -cp or
		 * classpath command line options. It is a child of Extension ClassLoader. It is
		 * implemented by sun.misc.Launcher$AppClassLoader class. All Java ClassLoader
		 * implements java.lang.ClassLoader.
		 */

		System.out.println("ClassLoader von ArrayList: " + ArrayList.class.getClassLoader());

		System.out.println("ClassLoader von Katze: " + Katze.class.getClassLoader());

		// ByteCode der Katze holen
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bin/demoClassLoader/Katze.class"));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int zahl;
		while ((zahl = bis.read()) != -1) {
			baos.write(zahl);
		}
		byte[] bytecode = baos.toByteArray();

		MyClassLoader myClassLoader = new MyClassLoader();

		Class<?> katzeClass = myClassLoader.findClass("demoClassLoader.Katze", bytecode);
		/* getClassLoader() Beschreibung
		 * Returns the class loader for the class. Some implementations may use null to
		 * represent the bootstrap class loader. This method will return null in such
		 * implementations if this class was loaded by the bootstrap class loader.
		 */
		ClassLoader cl = katzeClass.getClassLoader();
		ClassLoader appCl = Katze.class.getClassLoader();
		System.out.println(cl);
		/*
		 * bin/demoClassLoader/Katze.class ist bereits zum Kompilierzeitpunkt bekannt,
		 * d.h. im ClassPath und wird damit vom System Classloader geladen.
		 */
		Katze katze = new Katze();

		Object o = katzeClass.newInstance();
		System.out.println(katze.getClass());
		System.out.println(o.getClass());
		try {
			katze = (Katze) o;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
