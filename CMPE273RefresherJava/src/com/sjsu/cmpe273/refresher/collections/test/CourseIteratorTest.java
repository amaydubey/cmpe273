package com.sjsu.cmpe273.refresher.collections.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.collections.CourseIterator;

public class CourseIteratorTest {

	@Test
	public void testIteratorAddCourses() {
		List<String> courseList = new ArrayList<String>();
		Iterator<String> courseIterator = CourseIterator.addCourses(courseList);
		List<String> expectedCourseList = new ArrayList<String>();
		courseList.add("CMPE202");
		courseList.add("CMPE272");
		courseList.add("CMPE273");
		Iterator<String> expectedCourseIterator = expectedCourseList.iterator();
		while (courseIterator.hasNext() && expectedCourseIterator.hasNext()) {
			Assert.assertEquals(expectedCourseIterator.next(), courseIterator.next());
		}
	}

}
