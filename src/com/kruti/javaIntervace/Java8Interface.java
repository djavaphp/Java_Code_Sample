package com.kruti.javaIntervace;

@FunctionalInterface
interface Hello{
	public void hello();
	default void hello1() {
		System.out.println("hello1");
	}
	default void hello2(String a) {
		System.out.println("Hello "+ a);
	}
	static void hello3() {
		System.out.println("hello2");
	}
}
public class Java8Interface implements Hello {

	@Override
	public void hello() {
		System.out.println("Hello");
	}
	
	public static void main (String st[]) {
		Hello hello = () -> {
			
		};
		System.out.println(hello);
		Java8Interface j8 = new Java8Interface();
		j8.hello1();	
		j8.hello2("Kruti");
		
		Hello.hello3();
		
	}
}
