package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class UseOfArrayList01 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */
	public static void main(String[] args) {
		// getting new ArrayList -by default constructor-->initial capacity (ic) 10
		ArrayList ar = new ArrayList(); //ArrayList is a class
		ar.add("Shohag"); // index [0] 
		ar.add("Tofael");
		ar.add(5); // different data type is allowed, here int is used
		ar.add(""); // empty is allowed for String Type
		ar.add("Manir");
		ar.add("Orfat");
		ar.add("Shohag");// duplicate value is allowed
		ar.add("Lobid");
		ar.add(5.5); // ? double type
		ar.add('M'); // different data type is allowed, here char is used
		ar.add("Nafasat");
		ar.add("Mohammad");// ic is [10]-- then capacity will be increased to [{ic*(3/2)}+1]=16

		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // in Array this is length
		
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(3)); // output:
		System.out.println("Single index value: " + ar.get(7)); // output:
		System.out.println("Single index value: " + ar.get(9)); // output:
		System.out.println("Single index value: " + ar.get(11)); // output:
		System.out.println("Single index value: " + ar.get(ar.size() - 1)); // output:

		System.out.println("\n All the value of ArrayList: " + ar); //to string method is not used, because, ArrayList accept all data type

		System.out.println("\n^^^^^^^^^^^^^ Printing all the value of ArrayList ^^^^^^^^^^^^^^^^ ");
		// to print all elements (for loop, for each loop, iterator()
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			//System.out.print(ar.get(i)+" "); //will be in one line
		}

		/*
		 * now ar[] index is 16 capacity when we need to add for 10th index it jvm will
		 * create new array with capacity 16 elements of the prev. array will be shifted
		 * to new array & old array will be ready for garbage collection
		 */

	}
}
