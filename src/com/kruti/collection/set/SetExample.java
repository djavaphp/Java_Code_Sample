package com.kruti.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

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
		
		
		System.out.println("----- TreeSet -----");
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("B");
		t.add("a");
		t.add("D");
		t.add("b");
		t.add("C");
		System.out.println(t);
		//System.out.println(t.add(10)); //CCE
		//t.add(null); //NPE
		
		TreeSet t1 = new TreeSet(); //Before Java 7 it was not allowed to use Reference which has not implemented comparable
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("B"));
		t1.add(new StringBuffer("a"));
		t1.add(new StringBuffer("C"));
		t1.add(new StringBuffer("D"));
		t1.add(new StringBuffer("b"));
		System.out.println(t1);
		
		System.out.println("----Interationg---");
		Iterator i ;
		i=  t1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----Interat Desc---");
		i= t1.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----------");
		System.out.println(t);
		System.out.println("----------");
		System.out.println("First : "+ t.first());
		System.out.println("Last : "+ t.last());
		System.out.println("----Head set of B ---");
		i = t.headSet("B").iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}	
		System.out.println("----tail set of a ---");
		i = t.tailSet("a").iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----sub set of a and B ---");
		i = t.subSet("B", "a").iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("----------Comprator");
		Comparator comparator = t.comparator();
		System.out.println(comparator); // Returns null as it follows natural sorting order
		
		System.out.println("----------Comprator with custom");
		TreeSet t3 = new TreeSet<>(new SetComparator());
		t3.add("A");
		t3.add("B");
		t3.add("a");
		t3.add("D");
		t3.add("b");
		t3.add("C");
		
		System.out.println(t3);
		}
}


class SetComparator implements Comparator<String> { 
    public int compare(String str1, String str2) 
    { 
        String first_Str; 
        String second_Str; 
        first_Str = str1; 
        second_Str = str2; 
        return second_Str.compareTo(first_Str); 
    } 
} 