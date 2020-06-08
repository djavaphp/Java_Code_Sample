package com.kruti.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MapExample {
	public static void main(String st[]) throws InterruptedException {
		System.out.println("---- Hashmap ----");
		HashMap m = new HashMap<>();
		m.put(11, "Kruti");
		m.put(20, "Dave");
		m.put(31, "Dhaval");
		m.put(45, "Dave");
		m.put(101, "Dave");
		System.out.println(m);
		
		System.out.println("---- LinkedHashmap ----");
		LinkedHashMap lm = new LinkedHashMap<>(m);
		System.out.println(lm);
		System.out.println("---- IdentityHashmap ----");
		IdentityHashMap im= new IdentityHashMap<>(m);
		im.put("11", "Kruti JAni");
		System.out.println(im);
		System.out.println("---- WeakHashMap ----");
		System.out.println("-----");
		HashMap m1 = new HashMap<>();
		Temp t = new Temp();
		m1.put(t, "ABC");
		System.out.println(m1);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m1);
		System.out.println("-----");
		WeakHashMap wm = new WeakHashMap<>(m1);
		Temp t1 = new Temp();
		wm.put(t1, "CDE");
		System.out.println(wm);
		t1= null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(wm);
		
		System.out.println("---- TreeHahMap ----");
		TreeMap tm = new TreeMap(m);
		
		System.out.println("-----");
		System.out.println("First : "+ tm.firstKey());
		System.out.println("Last : "+ tm.lastEntry());
		Set s;
		Iterator i;
		System.out.println("----- HeadMap ----");
		s = tm.headMap(20).entrySet();
		i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("----- TailMap ----");
		s = tm.tailMap(20).entrySet();
		i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("----- SubMap ----");
		s = tm.subMap(20, 31).entrySet();
		i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("----- Comparator ----");
		Comparator comparator = tm.comparator();
		System.out.println(comparator); // Return null
		
		System.out.println("----------Comprator with custom");
		HashMap m4 = new HashMap<>();
		m4.put("1", "ABC");
		m4.put("2", "ABD");
		m4.put("11", "ABE");
		m4.put("10", "AB");	
		System.out.println(m4);
		TreeMap t3 = new TreeMap<>(new MapComparator());
		//t3.put(1, "ABC"); // CCE - heterogenious not allowed
		//t3.put(null, "ABC"); //NPE
		t3.put("1", "ABC");
		t3.put("2", "ABD");
		t3.put("11", "ABE");
		t3.put("10", "AB");	
		
		System.out.println(t3);
		
	}
}
class MapComparator implements Comparator<String> { 
    public int compare(String str1, String str2) 
    { 
        String first_Str; 
        String second_Str; 
        first_Str = str1; 
        second_Str = str2; 
        return second_Str.compareTo(first_Str); 
    } 
} 
class Temp{
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalized Called");
	}
}