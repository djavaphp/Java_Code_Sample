package com.kruti.thread.tutorial;

class ThreadState1 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

public class ThreadState implements Runnable{
public static Thread thread1; 
public static ThreadState temp;
public static void main(String st[]) {
	temp = new ThreadState();
	thread1 = new Thread(temp);
	 System.out.println("State of thread1 after creating it - " + thread1.getState()); 
     thread1.start(); 
       
     // thread1 moved to Runnable state 
     System.out.println("State of thread1 after calling .start() method on it - " +  
         thread1.getState()); 
	
}
	@Override
	public void run() {
		
		ThreadState1 state1 = new ThreadState1();
		Thread thread = new Thread(state1);
		System.out.println("ThreadState1 T2 State "+ thread.getState() );
		thread.start();
		System.out.println("ThreadState1 T2 State "+ thread.getState() );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("ThreadState1 T2 State "+ thread.getState() );
		
		try 
        { 
            // waiting for thread2 to die 
            thread.join(); 
        }  
        catch (InterruptedException e)  
        { 
            e.printStackTrace(); 
        } 
		System.out.println("ThreadState1 T2 State "+ thread.getState() );
	}

}
