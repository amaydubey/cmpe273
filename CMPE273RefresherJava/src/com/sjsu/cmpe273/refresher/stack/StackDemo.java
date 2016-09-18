package com.sjsu.cmpe273.refresher.stack;

import java.util.Scanner;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		int option = 0;

		Scanner sc = new Scanner(System.in);
		while (option != 4) {
			System.out.println("Welcome! Please select an option.");
			System.out.println("1. Push new element into stack.");
			System.out.println("2. Remove top of stack element.");
			System.out.println("3. Get top of stack element.");
			System.out.println("4. Exit.");

			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter new element.");
				String newElement = sc.next();
				stack.push(newElement);
				break;
			case 2:
				System.out.println(stack.pop() + " has been popped from the queue.");
				break;
			case 3:
				System.out.println(stack.getTopOfStack() + " is the top of stack element.");
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
