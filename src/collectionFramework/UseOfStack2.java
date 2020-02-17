package collectionFramework;

import java.util.Stack;

public class UseOfStack2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		stack.add("SD");
		stack.add("NC");
		stack.add("OR");
		stack.add("CA");

		if (stack.peek().equalsIgnoreCase("ca")) {
			System.out.println(stack.pop());
		}
	}
}
