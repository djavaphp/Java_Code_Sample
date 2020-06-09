package com.kruti.thread.tutorial;

public class App2 {

	public static void main(String ar[]) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i< 10 ;i++) {
					System.out.println("I :"+ i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		t1.start();
	}
}
