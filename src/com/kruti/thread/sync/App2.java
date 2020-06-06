package com.kruti.thread.sync;

public class App2 {

	private int count =0;
	private synchronized void increment() {
		count++;
	}
	public static void main(String ar[]) {
		App2 app1 = new App2();
		try {
			app1.doWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doWork() throws InterruptedException {
		Thread t1 = new Thread(new  Runnable() {			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}				
			}
		});
		
		Thread t2 = new Thread(new  Runnable() {			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					increment();
				}				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Cnt : "+ count);
	}
}
