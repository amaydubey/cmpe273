package com.sjsu.cmpe273.refresher.multithreading.thread;

public class CountThreadExtension extends Thread {
	public CountThreadExtension() {
		super("Count thread by extending Thread class");
		System.out.println("New thread" + this + " created.");
		start();
	}

	public void run() {
		System.out.println("Count starts:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Count thread interrupted");
			}
		}
		System.out.println("Count thread has finished running.");
	}
}
