package collection_linkedList;

import java.util.LinkedList;

public class UseOfLinkedList04 {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(345);
		ll.add(483);
		ll.add(533);
		ll.add(435);
		ll.add(533);
		ll.add(345);
		ll.add(876);
		ll.add(789); // Repetition possible
		ll.addFirst(308);
		ll.addLast(310);
		ll.set(0, 307);// new here, replacing the value from second
		ll.remove(3); // removing fourth one
		ll.removeFirst();
		ll.removeLast();
		System.out.println("The length of the LinkedList is: " + ll.size());
		System.out.println("\nPrinting single index value of LinkedList: " + ll.get(0));
		System.out.println("Printing single index value of LinkedList: " + ll.get(1));
		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of LinkedList ^^^^^^^^^^^^^^^^ ");
		
		int a = 0; 
		while (ll.size() > a) {
			System.out.println(ll.get(a)+ " ");
			a++;
		}}

}
