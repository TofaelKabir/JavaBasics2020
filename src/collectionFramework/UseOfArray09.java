package collectionFramework;

import java.util.Random;
import java.util.Scanner;

public class UseOfArray09 {
	/*
	 * Author: Tofael
	 */

	public static void main(String[] args) {
		//how Random works

        Random random = new Random();

        int a = random.nextInt(); //without limit(show negative number too)
        //int a = random.nextInt(100); //with limit
        System.out.println("Randomly chosen number: " + a);
       
    }
}
