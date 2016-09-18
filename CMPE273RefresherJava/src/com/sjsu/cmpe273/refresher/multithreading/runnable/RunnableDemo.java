package com.sjsu.cmpe273.refresher.multithreading.runnable;

public class RunnableDemo {

	public static void main(String[] args) {
		CountRunnableImplementation count = new CountRunnableImplementation();
		
		while(count.countThread.isAlive()){
			System.out.println("Main thread will be alive till the child thread is alive.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted.");
			}
		}
		
		System.out.println("Main thread has finished running.");
	}

}
