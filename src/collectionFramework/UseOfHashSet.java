package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class UseOfHashSet {

	public static void main(String[] args) {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Sohag");
		set.add("Tofael");
		set.add("Orfat");
		set.add("Sharif");
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of HashSet ^^^^^^^^^^^^^^^^ ");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
