package com.kruti.interview;
/**
 * Output number from 1 to x. X is divisable by 3, replace it with "AAA", If it is divisiable by 5 replace it with "BBB" ,
 *  and if it divisible by 3 and 5 both than replace it by "AAABBB"
 * @author Aditya
 *
 */
public class App {

	public static void main(String []s) {
		App app = new App();
		app.functionX(15);
	}
	
	public void functionX(int x) {
		for(int i=1 ; i<= x ; i++) {
			if(i % 3 == 0 && i % 5 ==0) System.out.println("AAABBB");
			else if (i % 3 ==0) System.out.println("AAA");
			else if (i % 5 ==0) System.out.println("BBB");
			else System.out.println(i);
		}
	}
}
