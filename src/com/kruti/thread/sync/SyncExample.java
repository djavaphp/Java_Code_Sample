package com.kruti.thread.sync;

class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

class Sender1 {
	public synchronized void send(String msg) {
		System.out.println("1 Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread  interrupted.");
		}
		System.out.println("\n 1. " + msg + "Sent");
	}
}

class SyncDemo extends Thread {
	private String msg;
	Sender sender;
	
	Sender1 sender1;

	// Recieves a message object and a string
	// message to be sent
	SyncDemo(String m, Sender obj) {
		msg = m;
		sender = obj;
	}
	
	SyncDemo(String m, Sender1 obj) {
		msg = m;
		sender1 = obj;
	}

	public void run() {
		// Only one thread can send a message
		// at a time.
		synchronized (sender) {
			// synchronizing the snd object
			sender.send(msg);
			
		}
		/*
		 * if(sender1!=null) { sender1.send(msg); }
		 */
	}
}

// Driver class 
class SyncExample {
	public static void main(String args[]) {
		Sender snd = new Sender();
		Sender1 snd1 = new Sender1();
		SyncDemo S1 = new SyncDemo(" Hi ", snd);
		SyncDemo S2 = new SyncDemo(" Bye ", snd);

		SyncDemo S3 = new SyncDemo(" Hi ", snd1);
		SyncDemo S4 = new SyncDemo(" Bye ", snd1);

		// Start two threads of ThreadedSend type
		S1.start();
		S2.start();
		S3.start();
		S4.start();

		// wait for threads to end
		try {
			S1.join();
			S2.join();
			S3.join();
			S4.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}