package com.sjsu.cmpe273.refresher.stack;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

	private Node<Item> topOfStack;
	private int noOfElements;

	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
	}

	public Stack() {
		topOfStack = null;
		noOfElements = 0;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void push(Item item) {
		if (isEmpty()) {
			topOfStack = new Node<Item>();
			topOfStack.item = item;
			topOfStack.next = null;
		} else {
			Node<Item> oldTopOfStack = topOfStack;
			topOfStack = new Node<Item>();
			topOfStack.item = item;
			topOfStack.next = oldTopOfStack;
		}
		noOfElements++;
	}

	public Item pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		} else {
			Item item = topOfStack.item;
			topOfStack = topOfStack.next;
			noOfElements--;
			return item;
		}
	}
	
	public Item getTopOfStack(){
		return topOfStack.item;
	}

	public Boolean isEmpty() {
		return topOfStack == null;
	}
}
