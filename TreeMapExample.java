package collectionsExamples;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapExample {

	public static void main(String args[]) {

		/* This is how to declare TreeMap */
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		/* Adding elements to TreeMap */
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");

		/* Display content using Iterator */
		System.out.println("Content of TreeMap:");
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		// REmoving a element
		tmap.remove(1);
		System.out.println("Content of TreeMap After removal:");
		Set set1 = tmap.entrySet();
		Iterator iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator1.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		// Size of the TreeSet
		int s = tmap.size();
		System.out.println("Size is:" + s);

		// Checking a element in tree set
		boolean b1 = tmap.containsKey(23);
		boolean b2 = tmap.containsValue("Jim");

		System.out.println(b1);
		System.out.println(b2);

	}
}