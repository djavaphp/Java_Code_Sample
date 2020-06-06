package com.kruti.thread.sync;

public class App1 {

	private int count =0;
	public static void main(String ar[]) {
		App1 app1 = new App1();
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
					count++;
				}				
			}
		});
		
		Thread t2 = new Thread(new  Runnable() {			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					count++;
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
