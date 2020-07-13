package demoGC;

import java.util.Date;

public class CheckGC {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM Memory: " + rt.totalMemory() / (1024 * 1024));
		System.out.println("Before Memory\t: " + rt.freeMemory() / (1024 * 1024));
		Date d = null;
		for (int i = 0; i < 10_000_000; i++) {
			d = new Date();
			d = null;
		}
		System.out.println("After Memory\t: " + rt.freeMemory() / (1024 * 1024));

		/*
		 * Calling the gc method suggests that the Java VirtualMachine expend effort
		 * toward recycling unused objects in order tomake the memory they currently
		 * occupy available for quick reuse.When control returns from the method call,
		 * the Java VirtualMachine has made a best effort to reclaim space from all
		 * discarded objects.
		 */
		System.gc();// Aufruf der Garbage Collection
		rt.gc(); // Alternativer Aufruf der Garbage Collection

		System.out.println("After GC Memory\t: " + rt.freeMemory() / (1024 * 1024));
	}
}
