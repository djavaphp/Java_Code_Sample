package com.kruti.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String str[]) {
	
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add(1);
		hs.add(null);
		System.out.println(hs.add("A")); // false
		System.out.println(hs); // Insertion order not presurved 
		
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add(1);
		lhs.add(null);
		System.out.println(lhs.add("A")); // false
		System.out.println(lhs); //[A, B, 1, null] // insertion order presurved 
	}
}
