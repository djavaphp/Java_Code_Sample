package com.kruti.collection.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class ArrayListExample {
	
	public static void main(String str[]) {
		ArrayList al = new ArrayList<>(); // default capacity 10
		al.add("A");
		al.add(1);
		al.add(null);
		al.add("A");
		System.out.println(al);
		System.out.println("Ref : "+ al.hashCode());
		al.remove(2);
		System.out.println(al);
		al.add(2, "M");
		al.add("N");
		al.add("O");
		al.add("P");
		al.add("Q");
		al.add("OL");
		//al.add("OLP");
		al.add("OLQ");
		System.out.println(al);
		System.out.println("Ref : "+ al.hashCode()); 
		 
		LinkedList al1 = new LinkedList(al); 
		System.out.println(al1);
		System.out.println("Ref : "+ al1.hashCode());
		
		System.out.println(al instanceof RandomAccess); // true
		System.out.println(al1 instanceof RandomAccess); // false
		System.out.println(al instanceof Cloneable); //true
		System.out.println(al1 instanceof Cloneable); // true
		System.out.println(al instanceof Serializable); //true
		System.out.println(al1 instanceof Serializable); //true
		
		
		List l1 = Collections.synchronizedList(al1);
		
	}

}
