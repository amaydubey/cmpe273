package com.sjsu.cmpe273.refresher.queues;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

	private Node<Item> frontElement;
	private Node<Item> rearElement;
	private int noOfElements;

	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}

	public Queue() {
		frontElement = null;
		rearElement = null;
		noOfElements = 0;
	}

	@Override
	public Iterator<Item> iterator() {
		return null;
	}

	public void enqueue(Item item) {
		Node<Item> lastElementOld = rearElement;
		rearElement = new Node<Item>();
		rearElement.item = item;
		rearElement.next = null;
		if (isQueueEmpty()) {
			frontElement = rearElement;
		} else {
			lastElementOld.next = rearElement;
		}
		noOfElements++;
	}

	public Item dequeue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		} else {
			Item item = frontElement.item;
			frontElement = frontElement.next;
			noOfElements--;
			if (isQueueEmpty()) {
				rearElement = null;
			}
			return item;
		}
	}

	public boolean isQueueEmpty() {
		return frontElement == null;
	}

	public Item getFrontElement() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty.");
			return null;
		} else {
			return frontElement.item;
		}
	}

}
