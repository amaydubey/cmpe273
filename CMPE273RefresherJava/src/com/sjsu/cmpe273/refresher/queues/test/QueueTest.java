package com.sjsu.cmpe273.refresher.queues.test;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.queues.Queue;

public class QueueTest {

	Queue<String> q = new Queue<String>();

	@Test
	public void testEnqueue() {
		q.enqueue("First");
		Assert.assertEquals("First", q.getFrontElement());
	}
	
	@Test
	public void testDequeue() {
		q.enqueue("First");
		Assert.assertEquals("First", q.dequeue());
	}

}
