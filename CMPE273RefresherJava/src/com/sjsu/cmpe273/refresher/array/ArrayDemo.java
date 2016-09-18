package com.sjsu.cmpe273.refresher.array;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array.");
		int size = sc.nextInt();
		int[] newIntegerArray = new int[size];

		System.out.println("Enter " + size + " elements.");
		for (int i = 0; i < newIntegerArray.length; i++) {
			newIntegerArray[i] = sc.nextInt();
		}

		newIntegerArray = bubbleSort(newIntegerArray);
		System.out.println("Here is the sorted array.");
		for (int i = 0; i < newIntegerArray.length; i++) {
			System.out.println(i+1 + ". " + newIntegerArray[i]);
		}
	}

	public static int[] bubbleSort(int[] newArray) {
		int size = newArray.length;
		int swapIndex;
		for (int m = size; m >= 0; m--) {
			for (int i = 0; i < size - 1; i++) {
				swapIndex = i + 1;
				if (newArray[i] > newArray[swapIndex]) {
					swapNumbers(i, swapIndex, newArray);
				}
			}
		}
		return newArray;
	}

	public static void swapNumbers(int i, int j, int[] newArray) {
		int temp;
		temp = newArray[i];
		newArray[i] = newArray[j];
		newArray[j] = temp;
	}
}
