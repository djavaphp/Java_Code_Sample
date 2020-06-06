package com.kruti.collection.list;

import java.util.LinkedList;

/**
[A, 1, null, A]
[B, 1, null, A]
[C, B, 1, null, A]
[C, B, 1, null]
[D, C, B, 1, null]

 * @author kruti
 *
 */
public class LinkedListExmaple {

	public static void main(String st[]) {
		LinkedList l = new LinkedList(); // Empty list
		l.add("A");
		l.add(1);
		l.add(null);
		l.add("A");
		System.out.println(l);
		l.set(0, "B"); // replace 
		System.out.println(l);
		l.add(0, "C");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("D");
		System.out.println(l);
		System.out.println(l.get(4));
	}
}
