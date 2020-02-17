package collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseOfPriorityQueue {
//question: not coming sequentially
	public static void main(String args[]) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("NY"); // head , first
		queue.add("NJ");
		queue.add("MA");
		queue.add("PA");
		queue.add("MD");
		queue.add("CT"); // tail , last
		// to remove specific obj/value-->if not mentioned removes peek
		queue.remove("MA"); // removes Orfat
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());

		// iterating the queue elements:
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of PriorityQueue (1) ^^^^^^^^^^^^^^^^ ");
		Iterator it1 = queue.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> it2 = queue.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
