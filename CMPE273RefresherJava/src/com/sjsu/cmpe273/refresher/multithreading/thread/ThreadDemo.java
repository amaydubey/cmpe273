package com.sjsu.cmpe273.refresher.multithreading.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		CountThreadExtension count = new CountThreadExtension();
		try {
			while (count.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread's run is over");
	}

}
