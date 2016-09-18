package com.sjsu.cmpe273.refresher.array.test;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.array.ArrayDemo;

public class ArrayDemoTest {

	@Test
	public void testSwapNumbers(){
		int[] newArray = new int[2];
		newArray[0] = 100;
		newArray[1] = 200;
		ArrayDemo.swapNumbers(0, 1, newArray);
		Assert.assertEquals(200, newArray[0]);
		Assert.assertEquals(100, newArray[1]);
	}

	@Test
	public void testSort(){
		int[] newArray = {56, 653, 12};
		ArrayDemo.bubbleSort(newArray);
		Assert.assertTrue(newArray[0]<=newArray[1] && newArray[1]<=newArray[2]);
	}
}