package com.kruti.thread.create;

public class MainThread extends Thread {

	public static void main(String st[]) {
		Thread t = new Thread();
		System.out.println("Main :"+ t.getName());
		t.setName("Kruti Main");
		
		System.out.println("Main :"+ t.getName());
		
		System.out.println("Main Thread Priority :"+ t.getPriority());
		t.setPriority(MIN_PRIORITY);

		System.out.println("Main Thread new Priority :"+ t.getPriority());
		
		for (int i = 0; i < 5; i++) 
        { 
            System.out.println("Main thread : "+ i); 
        } 
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				 for (int i = 0; i < 5; i++) 
			        { 
			            System.out.println("Child thread : "+i); 
			        } 
				
			}
		});
		t2.setName("Kruti Child");
		System.out.println("Child :"+ t2.getName());
		
		System.out.println("Child thread priority: "+ t2.getPriority()); 
        
        // setting priority of Main thread to MIN(1) 
		t2.setPriority(MAX_PRIORITY); 
          
        System.out.println("Child thread new priority: "+ t2.getPriority()); 
          
        // starting child thread 
        t2.start(); 
	} 
}
