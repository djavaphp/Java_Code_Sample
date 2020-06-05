package com.kruti.interview.strings;

public class App {

	public static void main(String st[]) {
		String s = new String("Kruti");
		s.concat(" Dave");
		System.out.println(s);
		
		s = s.concat(" Dave");
		System.out.println(s);
		
		//== operator meant for reference comparison and .equals is for content comparision
			
		String s1 = new String("Kruti");
		String s2 = new String("Kruti");
		System.out.println(s2 == s1);
		System.out.println(s2.equals(s1));
		
		Person p = new Person("Kruti", 10);
		Person p1 = new Person("Kruti" , 10);
		System.out.println(p == p1);
		System.out.println(p.equals(p1));
	}
}
