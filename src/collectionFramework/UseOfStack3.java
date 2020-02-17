package collectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class UseOfStack3 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack();
        stack.add("SD"); //bottom
        stack.add("NC");
        stack.add("OR");
        stack.add("CA"); //top

        System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (1) ^^^^^^^^^^^^^^^^ ");
        for (String string : stack) {
			System.out.println(string);
		}
        System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (2) ^^^^^^^^^^^^^^^^ ");
		Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n^^^^^^^^^^^^^ Printing all the element of Stack (3) ^^^^^^^^^^^^^^^^ ");
        while(!stack.empty()){
        System.out.println(stack.pop());
    }
  }
}
