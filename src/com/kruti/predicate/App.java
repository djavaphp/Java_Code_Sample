package com.kruti.predicate;

import java.util.function.Predicate;

/*
 * 
 * A Functional Interface is an Interface which allows only one Abstract method within the 
 * Interface scope. There are some predefined functional interface in Java like Predicate, consumer, 
 * supplier etc. The return type of a Lambda function (introduced in JDK 1.8) is a also functional interface.
 */
public class App {

	public static void main(String ar[]) {
		Predicate<Integer> lesserthan = i -> (i < 18);		
		System.out.println(lesserthan.test(10));
		System.out.println(lesserthan.test(20));
	}
}
