package com.kruti.thread.sync;

import java.util.Scanner;

// thread share same data
//volatile

class Processor extends Thread{
	private volatile boolean shutdown = true;
	public void run() {
		
		while(shutdown) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void shutdown() {
		shutdown= false;
	}
}


public class App {
	public static void main(String ar[]) {
	

		Processor proc1 = new Processor();
		proc1.start();
		

		Processor proc2 = new Processor();
		proc2.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		

		proc1.shutdown();
	}
}
