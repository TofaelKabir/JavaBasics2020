package collectionFramework;

import java.util.Scanner;

public class UseOfArray5 {

	public static void main(String[] args) {

        int [] list = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");

        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
            System.out.println(list[i]);
        }
        System.out.println("\nThe value in index 3 is: "+list[3]);
        sc.close();
    }
}