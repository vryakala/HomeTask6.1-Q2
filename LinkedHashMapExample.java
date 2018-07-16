package collectionsExamples;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String args[]) {
		// HashMap Declaration
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

		// Adding elements to LinkedHashMap
		lhmap.put(22, "Abey");
		lhmap.put(33, "Dawn");
		lhmap.put(1, "Sherry");
		lhmap.put(2, "Karon");
		lhmap.put(100, "Jim");

		// Generating a Set of entries
		Set set = lhmap.entrySet();

		// Displaying elements of Linked HashMap
		for (Map.Entry<Integer, String> entry : lhmap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		// Getting values based on key
		String text = lhmap.get(33);
		System.out.println(text);

		// Prints NULL if the key doesn't exist in the map
		String text1 = lhmap.get(4);

		System.out.println(text1);

		// If you add a duplicate key, the earlier one will get overwritten
		lhmap.put(1, "Hello");

		String text2 = lhmap.get(1);

		System.out.println(text2);
		System.out.println("Map key and values:");
		// Iterating through Hash map
		for (Map.Entry<Integer, String> entry : lhmap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		/* Remove values based on key */
		lhmap.remove(1);
		System.out.println("Map key and values after removal:");

		// Iterating through Linked Hash map
		for (Map.Entry<Integer, String> entry : lhmap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		// Checking whether Keys and Values are present in the Linked HashMap
		boolean b1 = lhmap.containsKey(33);
		boolean b2 = lhmap.containsValue("Jim");

		System.out.println(b1);
		System.out.println(b2);

		// Getting all the keys
		Set set1 = lhmap.keySet();
		System.out.println("Keys are:" + set1);

		// Getting all the values
		System.out.println("Values are : " + lhmap.values());

		// Cloning a Linked hash map
		HashMap<Integer, String> lhmap1 = new HashMap<Integer, String>();
		lhmap1 = (LinkedHashMap<Integer, String>) lhmap.clone();
		System.out.println("Values in Cloned map:");
		for (Map.Entry<Integer, String> entry : lhmap1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

		// Deleting all the values from Linked Hash map
		lhmap.clear();
	}
}