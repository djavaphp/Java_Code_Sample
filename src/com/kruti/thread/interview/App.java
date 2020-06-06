package com.kruti.thread.interview;

public class App {
	
	private int balance = 25000;
	
	public synchronized void decrement() {
		balance = balance -1000;
	}

	public static void main(String st[]) {
		//AtomicInteger balance =new AtomicInteger(25000);
		App app = new App();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				app.decrement();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				app.decrement();
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(app.balance);
	}

}
