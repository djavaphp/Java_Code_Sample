package com.kruti.thread.create;

import java.util.concurrent.Callable;

class Runner extends Thread{
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
}

class Runner5 implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class App  {

	public static void main(String ar[]) {
		Runner runner = new Runner();
		runner.start();
		
		Runner runner2 = new Runner();
		runner2.start();
	}
}
