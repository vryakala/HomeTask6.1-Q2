package collectionsExamples;

import java.util.*;

public class LinkedListExample {
	public static void main(String args[]) {

		LinkedList<String> linkedlist = new LinkedList<String>();

		// Adding elements to Linked List
		// This basically adds at the end of the list
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");

		// Display Linked List Content
		System.out.println("Linked List Content: " + linkedlist);

		// Add First and Last Element
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("LinkedList Content after addition: " + linkedlist);

		// Getting and setting Values
		Object firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: " + firstvar2);

		// Getting first and last elements
		Object firstele = linkedlist.getFirst();
		Object lastele = linkedlist.getLast();

		System.out.println(firstele);
		System.out.println(lastele);

		/* Remove first and last element */
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println("LinkedList after deletion of first and last element: " + linkedlist);

		/* Add to a Position and remove from a position */
		linkedlist.add(0, "Newly added item");
		linkedlist.remove(2);
		System.out.println("Final Content: " + linkedlist);

		// Adding elements from Array List to Linked List
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("String1");
		arraylist.add("String2");
		linkedlist.addAll(arraylist);

		System.out.println("Linked List Content after adding ArrayList Elements:" + linkedlist);

		// Cloning , copying elements of one list into other
		Object linkedlist1 = linkedlist.clone();

		System.out.println("linkedlist elements" + linkedlist);
		System.out.println("linkedlist1 elements" + linkedlist1);

		// Checking a element is present in the list
		boolean var = linkedlist.contains("TestString");
		boolean var1 = linkedlist.contains("Item2");

		System.out.println(var);
		System.out.println(var1);

		// Getting index of specified element
		int i = linkedlist.indexOf("Item1");

		System.out.println(i);

		// Getting index of last occurrence of specific element
		// Returns -1 on not finding the element
		int pos = linkedlist.lastIndexOf("hello");
		int pos1 = linkedlist.lastIndexOf("Item2");

		System.out.println(pos);
		System.out.println(pos1);

		// Size of linked list
		int s = linkedlist.size();

		System.out.println("Size of linked list: " + s);

		// Removing all the elements from Linked List
		linkedlist.clear();

		System.out.println("Linked List content: " + linkedlist);
	}
}