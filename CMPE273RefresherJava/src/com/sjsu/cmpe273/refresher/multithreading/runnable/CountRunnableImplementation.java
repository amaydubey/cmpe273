package com.sjsu.cmpe273.refresher.multithreading.runnable;

public class CountRunnableImplementation implements Runnable {

	Thread countThread;

	public CountRunnableImplementation() {
		countThread = new Thread(this, "Count Thread");
		System.out.println("New thread " + countThread + " created.");
		countThread.start();
	}

	@Override
	public void run() {
		System.out.println("Count starts:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
		System.out.println("Thread has finished running.");
	}

}
