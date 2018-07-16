package collectionsExamples;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {

		TreeSet<String> tset = new TreeSet<String>();
		tset.add("ABC");
		tset.add("String");
		tset.add("Test");
		tset.add("Pen");
		tset.add("Ink");
		tset.add("Jack");

		System.out.println(tset);

		TreeSet<Integer> tset2 = new TreeSet<Integer>();

		tset2.add(88);
		tset2.add(7);
		tset2.add(101);
		tset2.add(0);
		tset2.add(3);
		tset2.add(222);

		System.out.println(tset2);

		// REmoving a element
		tset.remove("ABC");
		System.out.println(tset);

		// Size of the TreeSet
		int s = tset.size();
		System.out.println("Size is:" + s);

		// Returning first element in the set order
		String s1 = tset.first();
		System.out.println("First Element:" + s1);

		// Returning last element in the set order
		String s2 = tset.last();
		System.out.println("Last Element:" + s2);

		// Checking a element in tree set
		boolean b1 = tset.contains("Ink");
		System.out.println(b1);
	}

}
