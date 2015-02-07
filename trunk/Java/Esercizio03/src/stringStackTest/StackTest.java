package stringStackTest;

import string.StringStack;

public class StackTest {

	public static void main(String[] args) {

		StringStack stack1 = new StringStack(2);
		StringStack stack2 = new StringStack(2);

		stack1.push("Ciao1");
		stack1.push("Ciao2");
		stack1.push("Ciao3");
		stack2.push("Ciao4");
		stack2.push("Ciao5");
		stack2.push("Ciao6");

		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());

	}

}
