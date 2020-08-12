package listen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListenPerformance {
	public static void main(String[] args) {
		long time = 0;
		long timeAfter = 0;

		List<Integer> arList = new ArrayList<>();
		List<Integer> list = new LinkedList<>();

		// ----------------LinkedList----------------------
		for (int i = 0; i < 2_500_000; i++) {
			list.add(i);
		}
		System.out.println("LinkedList gefuellt");
		// ----------------In die Mitte einfuegen----------------------
		System.out.println("LinkedList in die Mitte einfuegen");
		time = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			list.add(list.size() / 2, 222);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("LinkedList Mitte eingefuegt ms: " + (timeAfter - time));

		// ----------------Am Anfang einfuegen----------------------
		System.out.println("LinkedList Am Anfang einfuegen");
		time = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			list.add(0, 222);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("LinkedList Am Anfang eingefuegt ms: " + (timeAfter - time));

		// ----------------Am Ende einfuegen----------------------
		System.out.println("LinkedList am Ende einfuegen");
		time = System.currentTimeMillis();
		for (int i = 0; i < 5000000; i++) {
			list.add(list.size(), 222);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("LinkedList Am Ende eingefuegt ms: " + (timeAfter - time));

		// -----------------ArrayList----------------------

		for (int i = 0; i < 2_500_000; i++) {
			arList.add(i);
		}
		System.out.println("ArrayList gefuellt");
		// ----------------In die Mitte einfuegen----------------------
		System.out.println("ArrayList in die Mitte einfuegen");
		time = System.currentTimeMillis();
		for (int i = 0; i < 50; i++) {
			arList.add(arList.size() / 2, 222);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("ArrayList in dieMitte eingefuegt ms: " + (timeAfter - time));
		// ----------------Am Anfang Mitte einfuegen----------------------
		System.out.println("ArrayList Am Anfang einfuegen");
		time = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			arList.add(0, 222);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("ArrayList Am Anfang eingefuegt ms: " + (timeAfter - time));

		// ----------------Am Ende einfuegen----------------------
		System.out.println("ArrayList am Ende einfuegen");
		time = System.currentTimeMillis();
		for (int i = 0; i < 5_000_000; i++) {
			arList.add(arList.size(), 222);
		}
		timeAfter = System.currentTimeMillis();
		System.out.println("ArrayList Am Ende eingefuegt ms: " + (timeAfter - time));

	}
}
