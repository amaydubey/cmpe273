package com.sjsu.cmpe273.refresher.generics.test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.generics.GenericIterator;

public class GenericIteratorTest {

	@Test
	public void testGenericIterator() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);

		GenericIterator.iterateGeneric(intList);

		String expectedOutput = "1 2 3 4 5 \n";
		Assert.assertEquals(expectedOutput, outContent.toString());
	}

}
