package collectionFramework;

import java.util.Random;
import java.util.Scanner;

public class UseOfArray7 {

	public static void main(String[] args) {

        int [] list = new int[5];

        Random random = new Random();
      
        for(int j=0; j<list.length;j++) {
            list[j] = random.nextInt(100); //if has boundary
            System.out.println(list[j]);
        }

    }

}
