package com.kruti.thread.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2= new ArrayList<>();

	public void stage1() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}
	
	public void stage2() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));
	}
	public void process () {
		for(int i=0; i<1000 ;i++) {
			stage1();
			stage2();
		}
	}
	public void main() {
		System.out.println("Running...");
		
		long start = System.currentTimeMillis();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				process();
			}
		});
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time Taken :"+ (end - start));
		System.out.println("List 1 size : "+ list1.size());
		System.out.println("List 1 size : "+ list2.size());
		
	}
}
