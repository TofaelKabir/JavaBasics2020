package collectionFramework;

import java.util.Arrays;

public class UseOfArray01 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */

	public static void main(String[] args) {
		
		int [] a = new int[6]; // declaring size of the array, Array is fixed size // a is the array name 
		                       // [] called container //Array is static
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;
		a[3] = 'j';  // see below
		
		a[5] = 56;
		
		// print single index value:
		System.out.println("Printing single index value: " + a[0]);// output: 5
		System.out.println("Printing single index value: " + a[3]);// output: 0
		System.out.println("Printing single index value: " + a[5]);// output: 5
		
		System.out.println("\nThe length of the array is: " + a.length); //length preserve the size of array, not method, field or variable
		System.out.println("Printing Array ID: " + a);// Array ID
		System.out.println("Printing hashCode of the Array, represented by data: " + Arrays.hashCode(a));// hashCode of the Array, represented by data
		//System.out.println("Printing hashCode of the Array, represented by data: " + Arrays.deepHashCode(a));
		
		System.out.println("Printing the index position of the value form the ref: "+ Arrays.binarySearch(a,50)); //---->to get the index position of the value form the ref
		System.out.println("\nThe length of the array is: " + (a.length-1)); //for understanding the next line
		System.out.println("\nPrinting single index value: " + a[a.length-1]); //find the value for (length-1) no.
	}
}
/*
Note: As we know that array does not accept mixed data type but if we try to put char in int[] array it will accept and when we print that index value it will show a strange numerical value. Though it looks like a int value but it is actually an ASCII value. At runtime char is converted to ASCII value. That means every char has a specific ASCII value. There is even a specific calculation in the ASCII table. Have a look at the table above. 
*/