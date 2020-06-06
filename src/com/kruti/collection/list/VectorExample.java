package com.kruti.collection.list;

import java.util.Vector;
/**
 * 
 Capacity :10 Size :0

Capacity :20 Size :11
Capacity :44 Size :23
Capacity :7 Size :6
Capacity :9 Size :8

 */
public class VectorExample {

	public static void main(String st[]) {
		Vector v = new Vector();
		
		System.out.println(" Default Capacity :"+v.capacity()+" Size :"+ v.size()); //Capacity :10 Size :0
		v.addElement("A");
		v.add("b");
		v.removeElement("A");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		v.add("b");
		System.out.println("Capacity :"+v.capacity()+" Size :"+ v.size()); //Capacity :20 Size :11
		Vector v1 = new Vector<>(v);
		v1.add("b");
		v1.add("b");
		v1.add("b");
		v1.add("b");
		v1.add("b");
		v1.add("b");v1.add("b");v1.add("b");
		v1.add("b");v1.add("b");v1.add("b");
		v1.add("b");
		System.out.println("Capacity :"+v1.capacity()+" Size :"+ v1.size()); //Capacity :44 Size :23		
		Vector v2 = new Vector<>(5, 2);
		v2.addElement("C");
		v2.addElement("C");
		v2.addElement("C");
		v2.addElement("C");v2.addElement("C");
		v2.addElement("C");
		System.out.println("Capacity :"+v2.capacity()+" Size :"+ v2.size());// new capacity is 7
		v2.addElement("C");v2.addElement("C");
		System.out.println("Capacity :"+v2.capacity()+" Size :"+ v2.size()); // new capacity is 9
		
	}
}
