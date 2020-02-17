package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class UseOfArrayList07 {
	/*
	 * Author: Tofael
	 */
	public static void main(String[] args) {
		int limit = 5;
		List<Integer> list = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < limit; i++) {
			list.add(random.nextInt(500));
			System.out.println(list.get(i));
		}
	}
}
