package collectionFramework;

import java.util.Scanner;

public class UseOfArray06 {
	/*
	 * Author: Tofael
	 */

	public static void main(String[] args) {

		System.out.println("Please enter your full name here - ");
		Scanner scanner = new Scanner(System.in);
		String myName = scanner.nextLine();
		System.out.println("Hey ! " +  myName + " , now you know how Scanner class works!!");
		scanner.close();
	}
}