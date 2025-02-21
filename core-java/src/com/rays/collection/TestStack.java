
package com.rays.collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		// Create a stack
		Stack stack = new Stack();

		// Push elements into stack
		stack.push("1");
		stack.push("2");
		stack.push("3");

		System.out.println("stack => " + stack);

		// Gets top object ("3"), without removing it from stack
		System.out.println(stack.peek());
		System.out.println("stack => " + stack);

		// Gets top object ("3"), and remove it from stack
		System.out.println(stack.pop());
		System.out.println("stack => " + stack);

		// Gets top object ("2"), and remove it from stack
		System.out.println(stack.pop());
		System.out.println("stack => " + stack);

		// Gets top object ("1"), and remove it from stack
		System.out.println(stack.pop());
		System.out.println("stack => " + stack);
	}
}
