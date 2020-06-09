package com.kruti.thread.tutorial;

class YieldSleepJoinExample1 extends Thread {

	 public void run() 
	    { 
	        for (int i=0; i<5 ; i++) 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control 1"); 
	    } 
}

public class YieldSleepJoinExample extends Thread {

	public static void main(String st[]) throws InterruptedException {
		
		System.out.println("--------- yield ---------");
		YieldSleepJoinExample1 example1 = new YieldSleepJoinExample1();
		example1.start();
		
		for (int i=0; i<5 ; i++) {
			// Control passes to child thread 
            Thread.yield(); 
  
            // After execution of child Thread 
            // main thread takes over 
            System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
		}

		System.out.println("--------- Sleep ---------");
		Thread t = new Thread(new SleepDemo()); 
		  
        // call run() function 
        t.start(); 
  
        Thread t2 = new Thread(new SleepDemo()); 
  
        // call run() function 
        t2.start();
        
        System.out.println("--------- Join ---------");
        
        Thread t3 = new Thread(new JoinDemo()); 
        t3.start(); 
  
        // Waits for 1000ms this thread to die. 
        t3.join(1000); 
  
        System.out.println("\nJoining after 1000"+ 
                             " mili seconds: \n"); 
        System.out.println("Current thread: " + 
                                    t3.getName()); 
  
  
        // Checks if this thread is alive 
        System.out.println("Current Is alive? " + t3.isAlive()); 
        
	} 
}

class SleepDemo implements Runnable 
{ 
    Thread t; 
    public void run() 
    { 
        for (int i = 0; i < 4; i++) 
        { 
            System.out.println(Thread.currentThread().getName() 
                                                   + "  " + i); 
            try
            { 
                // thread to sleep for 1000 milliseconds 
                Thread.sleep(1000); 
            } 
  
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
    } 
}

class JoinDemo implements Runnable 
{ 
    public void run() 
    { 
        Thread t = Thread.currentThread(); 
        System.out.println("Current Run thread: "
                               + t.getName()); 
  
        // checks if current thread is alive 
        System.out.println("Is Alive? "
                               + t.isAlive()); 
    } 
}
