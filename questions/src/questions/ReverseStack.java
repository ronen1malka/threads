package questions;

import java.util.Stack;

public class ReverseStack {

	public static void reverse(Stack<Integer> s) // called at the start
	{
		int num = (int) s.pop();
		if (s.size() != 1) {
			reverse(s);
		}
		placeCurrAtBottomOfStack(s, num);
	}

	private static void placeCurrAtBottomOfStack(Stack<Integer> stack, int a) {
		System.out.println("put " + a + " at end of " + stack.toString());
		int num = (int) stack.pop();
		if (stack.size() != 0) {
			placeCurrAtBottomOfStack(stack, a);
		} else {
			stack.push(a);
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
		//ReverseStack.reverse(s);
		ReverseStack.placeCurrAtBottomOfStack(s, 75);
		System.out.println(s.toString());
	}

}
