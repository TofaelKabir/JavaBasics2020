package collectionFramework;

import java.util.Scanner;

public class UseOfArray6 {

	public static void main(String[] args) {
    //don't understand it, need discussion
        int [] list = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");

        for(int j=0; j<list.length;j++) {
            list[j] = sc.nextInt();
        }
        for(int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
        sc.close();
    }
}