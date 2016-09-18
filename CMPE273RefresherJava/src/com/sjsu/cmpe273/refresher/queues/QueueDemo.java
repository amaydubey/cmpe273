package com.sjsu.cmpe273.refresher.queues;

import java.util.Scanner;

public class QueueDemo {

	public static void main(String[] args) throws Exception {

		Queue<String> queue = new Queue<String>();

		int option = 0;

		Scanner sc = new Scanner(System.in);
		while (option != 4) {
			System.out.println("Welcome! Please select an option.");
			System.out.println("1. Enter new element in queue.");
			System.out.println("2. Remove last element from queue.");
			System.out.println("3. Get first element.");
			System.out.println("4. Exit.");

			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter new element.");
				String newElement = sc.next();
				queue.enqueue(newElement);
				break;
			case 2:
				System.out.println(queue.dequeue()+ " has been removed from the queue.");
				break;
			case 3:
				System.out.println(queue.getFrontElement()+" is the front element.");
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input. Please try again.");
				break;
			}

		}
	}

}
