package com.sjsu.cmpe273.refresher.stack.test;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.stack.Stack;

public class StackTest {
	Stack<String> stack = new Stack<String>();

	@Test
	public void testPush() {
		stack.push("TOS");
		Assert.assertEquals("TOS", stack.getTopOfStack());
	}

	@Test
	public void testPop() {
		stack.push("TOS");
		Assert.assertEquals("TOS", stack.pop());
	}
}