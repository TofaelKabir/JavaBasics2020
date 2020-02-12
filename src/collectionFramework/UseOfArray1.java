package collectionFramework;


public class UseOfArray1 {
	/*
	 * Author: Shohag, Organised by: Tofael
	 */

	public static void main(String[] args) {
		int [] a = new int[6]; // declaring size of the array // a is the array name // [] called container
		a[0] = 5;
		a[1] = 15;
		a[2] = 50;
		//a[3] = 'j';  //Nasir
		
		a[5] = 56;
		// print single index value:
		System.out.println("Printing single index value: " + a[0]);// output: 5
		System.out.println("Printing single index value: " + a[3]);// output: 0
		System.out.println("Printing single index value: " + a[5]);// output: 5
		System.out.println("\nThe length of the array is: " + a.length);
		System.out.println("\nThe length of the array is: " + (a.length-1)); //for understanding the next line
		System.out.println("\nPrinting single index value: " + a[a.length-1]); //find the value for (length-1) no.
	}
}