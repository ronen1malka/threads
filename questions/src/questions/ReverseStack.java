package questions;

import java.util.Stack;

public class ReverseStack {

	public static void reverse(Stack<Integer> stack) // called at the start
	{
		int num = (int) stack.pop();
		if (stack.size() != 1) {
			reverse(stack);
		}
		placeCurrAtBottomOfStack(stack, num);
		
	}

	private static void placeCurrAtBottomOfStack(Stack<Integer> stack, int newVal) {
		System.out.println("put " + newVal + " at end of " + stack.toString());
		int num = (int) stack.pop();
		if (stack.size() != 0) {
			placeCurrAtBottomOfStack(stack, newVal);
		} else {
			stack.push(newVal);
		}
		stack.push(num);
		System.out.println("Done:" + stack.toString());
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.toString());
		ReverseStack.reverse(s);
		ReverseStack.placeCurrAtBottomOfStack(s, 75);
		System.out.println(s.toString());
	}

}
