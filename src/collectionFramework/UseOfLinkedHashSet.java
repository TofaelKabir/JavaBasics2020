package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class UseOfLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
