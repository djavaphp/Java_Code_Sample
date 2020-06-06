package com.kruti.predicate;

import java.util.function.Predicate;

/*
 * Predicate Chaining
 * using and :
 * negate :a predicate that represents the logical negation of this
 * or :
 */
public class App1 {
	public static void main(String ar[]) {
		// Creating predicate
		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);

		// Calling Predicate method
		boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
		System.out.println(result2);
		pred(10, (i) -> i > 7);
		pred(5, (i) -> i > 7);
		predicate_or();

	}

	static void pred(int number, Predicate<Integer> predicate) {
		System.out.println("Number " + predicate.test(number));
		if (predicate.test(number)) {
			System.out.println("Number " + number);
		}
	}

	public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};

	public static void predicate_or() {

		Predicate<String> containsLetterA = p -> p.contains("A");
		String containsA = "And";
		boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
		System.out.println(outcome);
	}
}
