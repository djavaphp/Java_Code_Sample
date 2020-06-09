package com.kruti.thread.sync;

import java.util.ArrayList;
import java.util.List;

public class NeedOfSyncExample {
	public static void main(String s[]) {
		Multithread t = new Multithread();
		t.increment();
		System.out.println(t.getValue());

		// Object of Line class that is shared
		// among the threads.
		Line obj = new Line();

		// creating the threads that are
		// sharing the same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);

		// threads start their execution.
		train1.start();
		train2.start();
		
		
		System.out.println("Block Synch---------");
		BlockSynch bs = new BlockSynch(); 
        List<String> list = new ArrayList<String>(); 
        bs.name("Kruti", list); 
        System.out.println("NAme : "+bs.name);
        System.out.println("count "+bs.count);
        
        bs.name("Dave", list); 
        System.out.println("NAme : "+bs.name);
        System.out.println("count "+bs.count);
        
        System.out.println("Block Synch---------");
	}
}

class Multithread {
	private int i = 0;

	public void increment() {
		i++;
	}

	public int getValue() {
		return i;
	}
}

class Line {
	// if multiple threads(trains) will try to
	// access this unsynchronized method,
	// they all will get it. So there is chance
	// that Object's state will be corrupted.
	public void getLine() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Non-Synch :"+i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public synchronized void getLine1() { // synch method
		for (int i = 0; i < 3; i++) {
			System.out.println("Synch :"+i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Train extends Thread {
	// reference to Line's Object.
	Line line;

	Train(Line line) {
		this.line = line;
	}

	@Override
	public void run() {
		line.getLine();
		line.getLine1();
	}
}


class BlockSynch 
{ 
    String name = ""; 
    public int count = 0; 
  
    public void name(String newName, List<String> list) 
    { 
        // Only one thread is permitted 
        // to change  name at a time. 
        synchronized(this) 
        { 
            name = newName; 
            count++;  // how many threads change  name. 
        } 
  
        // All other threads are permitted 
        // to add  name into list. 
        list.add(name); 
    } 
} 