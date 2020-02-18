package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class UseOfTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String args[]){
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("d"); // no duplicate allowed
		set.add("e");
		set.add("f");
		set.add("d");

		System.out.println("^^^^^^^^^^^^^ Printing all the element of TreeSet ^^^^^^^^^^^^^^^^ ");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
