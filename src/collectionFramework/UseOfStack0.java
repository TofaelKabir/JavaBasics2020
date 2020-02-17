package collectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class UseOfStack0 {

	// The Stack class represents a last-in-first-out (LIFO) stack of objects

	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();
		stack.push("NY");  //Bottom
		stack.add("NJ");
		stack.push("CT");
		stack.push("MA");
		stack.add("MD");
		stack.push("PA");  //Top

		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (1) ^^^^^^^^^^^^^^^^ ");
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// to check the position of CT
		System.out.println("\nThe position of CT is: " + stack.search("CT"));
		//Looks at the object at the top of this stack without removing it from the stack.
		// to find the peek element as per LIFO
		System.out.println("\nFind the element using peek(): " + stack.peek()); // LIFO: PA
		System.out.println("\nThe 1st pop: " + stack.pop());
		// Popping out peek element and find the latest peek element
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (2) ^^^^^^^^^^^^^^^^ ");
		
		Iterator<String> it1 = stack.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("\nFind the element after using pop() then peek(): " + stack.peek());
		// popping out all elements and check stack is empty or not
		System.out.println("\nThe 2nd pop: " + stack.pop());
		System.out.println("The 3rd pop: " + stack.pop());
		System.out.println("The 4th pop: " + stack.pop());
		System.out.println("The 5th pop: " + stack.pop());
		System.out.println("The 6th pop: " + stack.pop());
		
		// check is stack empty or not
		System.out.println("\nIt will returns true because no element in our stack: " + stack.empty());
		// check is there any peek
		stack.push("CA");
		System.out.println("\nFind the element after using final pop() then peek(): " + stack.peek());

	}
}
