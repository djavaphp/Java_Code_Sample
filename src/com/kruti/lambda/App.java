package com.kruti.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface HelloWorld{
	public String hello();	
}

@FunctionalInterface
interface HelloWorldWithOneParam{
	public String hello(String s);
}

@FunctionalInterface
interface HelloWorldWithTwoParam{
	public String hello(String s, String b);
}
public class App {

	public static void main(String args[]) {
		HelloWorld h = () ->{
			return "Hello";
		};
		System.out.println(h.hello());
		
		HelloWorldWithOneParam h1 = (a)->{
			return "Hello World " + a;
		};
		System.out.println(h1.hello("Kruti"));
		
		HelloWorldWithTwoParam h2 = (a, b) ->{
			return a + b ;	
		};
		System.out.println(h2.hello("Kruti" ," Dave"));	
				
		// List 		
		List<String> list=new ArrayList<String>();  
	       list.add("Kruti ");         
	       list.add("Navish");       
	       list.add("Dhaval");         
	       list.add("Panth");         
	       list.add("Aditya");                
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       );     
	   
	       Map<String, Integer> prices = new HashMap<>();
			prices.put("Apple", 50);
			prices.put("Orange", 20);
			prices.put("Banana", 10);
			prices.put("Grapes", 40);
			prices.put("Papaya", 50);
			
			/* Iterate without using Lambda
			   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
			   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
			   }
			*/ 
			
			prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));

	}
}
