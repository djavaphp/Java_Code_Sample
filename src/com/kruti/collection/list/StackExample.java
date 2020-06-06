package com.kruti.collection.list;

import java.util.Stack;
/**
 * [A, B, C, D]
4
-1
[A, B, C]
C

 *
 */
public class StackExample {

	public static void main(String st[]) {
		Stack stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack); // instertion order pessureved
		System.out.println(stack.search("A"));
		System.out.println(stack.search("Z"));
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());		
	}
}
