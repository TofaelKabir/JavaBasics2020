package collectionFramework;

import java.util.Scanner;

public class UseOfArray06 {
	/*
	 * Author: Tofael
	 */

	public static void main(String[] args) { //we will study again

		System.out.println("Please enter your full name");
		Scanner sc = new Scanner(System.in);
		String Name=sc.nextLine();
		System.out.println("Hey ! " + Name + " , now you know how Scanner class works!!");
        sc.close();
    }
}