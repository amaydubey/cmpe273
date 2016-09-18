package com.sjsu.cmpe273.refresher.collections.test;

import java.util.Enumeration;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.collections.CourseEnumeration;

public class CourseEnumerationTest {

	@Test
	public void testEnumAddCourses() {
		Vector<String> courseVector = new Vector<String>();
		Enumeration<String> courseEnumerator = CourseEnumeration.addCourses(courseVector);
		Vector<String> expectedCourseVector = new Vector<String>();
		expectedCourseVector.add("CMPE202");
		expectedCourseVector.add("CMPE272");
		expectedCourseVector.add("CMPE273");
		Enumeration<String> expectedCourseEnumerator = expectedCourseVector.elements();
		while (courseEnumerator.hasMoreElements() && expectedCourseEnumerator.hasMoreElements()) {
			Assert.assertEquals(expectedCourseEnumerator.nextElement(), courseEnumerator.nextElement());
		}
	}

}
