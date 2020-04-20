package collectionFramework;

import java.util.Scanner;

import abstraction01.Car;

public class UseOfArray06 {
	/*
	 * Author: Tofael
	 */

	public static void main(String[] args) {

		System.out.println("Please enter your full name here - ");
		Scanner scanner = new Scanner(System.in); //System Class, in is a property --input stream
		String myName = scanner.nextLine();  //nextInt for number, nextLine is for String
		System.out.println("Hey ! " +  myName + " , now you know how Scanner class works!!");
		scanner.close();
	}
}