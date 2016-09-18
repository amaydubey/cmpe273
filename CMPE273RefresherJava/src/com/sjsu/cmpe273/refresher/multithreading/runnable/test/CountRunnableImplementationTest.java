package com.sjsu.cmpe273.refresher.multithreading.runnable.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.multithreading.runnable.CountRunnableImplementation;


public class CountRunnableImplementationTest {

private CountRunnableImplementation counter = new CountRunnableImplementation();
	
	@Test
	public void testCount()
	{
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		counter.run();
		String expectedOutput = "Count starts:\n0\nCount starts:\n0\n1\n1\n2\n2\n3\n3\n4\n4\n5\n5\n6\n6\n7\n7\n8\n8\n9\n9\nThread has finished running.\n";
		Assert.assertEquals(expectedOutput, outContent.toString());
	}
}
