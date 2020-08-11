package demoArrayList;

import java.util.ArrayList;
import java.util.List;

public class DemoSubList {

	public static void main(String[] args) {
		/*
		 * Returns a view of the portion of this list between the specified fromIndex,
		 * inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the
		 * returned list is empty.) The returned list is backed by this list, so
		 * non-structural changes in the returned list are reflected in this list, and
		 * vice-versa.The returned list supports all of the optional list operations.
		 */
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		List<Integer> subList = list.subList(2, 5);
		System.out.println(subList);

		subList.set(2, 5000);
		System.out.println(list);
		System.out.println(subList);

	}

}
