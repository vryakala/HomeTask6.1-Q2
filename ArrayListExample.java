package collectionsExamples;

import java.util.*;

public class ArrayListExample {
	public static void main(String args[]) {

		ArrayList<String> arrlst = new ArrayList<String>();

		// Adding elements to Array list
		arrlst.add("Ajeet");
		arrlst.add("Harry");
		arrlst.add("Chaitanya");
		arrlst.add("Steve");
		arrlst.add("Anuj");

		// Displaying elements in Array list
		System.out.println("Currently the array list:" + arrlst);

		// Add element at the given index
		arrlst.add(0, "Rahul");
		arrlst.add(1, "Justin");

		// Remove elements from Array list
		arrlst.remove("Chaitanya");
		arrlst.remove("Harry");

		System.out.println("Current array list is:" + arrlst);

		// Remove element from the given index
		arrlst.remove(1);

		System.out.println("Current array list is:" + arrlst);

		// Update an element at a given index
		arrlst.set(2, "Tom");

		System.out.println("Current array list is:" + arrlst);

		// Getting index of an object
		// If the element is not found in the list then this method returns the
		// value -1.
		int pos = arrlst.indexOf("Tom");

		System.out.println("Index of TOM is:" + pos);

		// To get object at a specific index
		String str = arrlst.get(2);

		System.out.println("Object present at index 2 is:" + str);

		// Size of array list
		int numberofitems = arrlst.size();

		System.out.println("Size:" + numberofitems);

		// Check if a object is present in the array list
		boolean b1 = arrlst.contains("Tom");
		System.out.println(b1);
		boolean b2 = arrlst.contains("Harry");
		System.out.println(b2);

		// Remove all elements of array list in one go
		arrlst.clear();

		System.out.println("Current array list is:" + arrlst);
	}
}
