package collectionsExamples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	// LinkedHashSet maintains the insertion order. Elements gets sorted in the
	// same sequence in which they have been added to the Set.

	public static void main(String[] args) {

		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		// Adding elements to the LinkedHashSet
		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("N");
		lhset.add("O");
		lhset.add("KK");
		lhset.add("FGH");
		System.out.println(lhset);

		// LinkedHashSet of Integer Type
		LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

		// Adding elements
		lhset2.add(99);
		lhset2.add(7);
		lhset2.add(0);
		lhset2.add(67);
		lhset2.add(89);
		lhset2.add(66);
		System.out.println(lhset2);

		// REmoving a element
		lhset.remove("Z");
		System.out.println(lhset);

		// Size of the TreeSet
		int s = lhset.size();
		System.out.println("Size is:" + s);

		// Checking a element in tree set
		boolean b1 = lhset.contains("N");
		System.out.println(b1);
	}
}