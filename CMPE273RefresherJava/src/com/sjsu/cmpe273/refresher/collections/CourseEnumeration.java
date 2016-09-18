package com.sjsu.cmpe273.refresher.collections;

import java.util.Enumeration;
import java.util.Vector;

public class CourseEnumeration {

	public static void main(String[] args) {
		Vector<String> courseVector = new Vector<String>();
		Enumeration<String> courseEnumerator = addCourses(courseVector);
		System.out.println("The list of courses is as follows:");
		while (courseEnumerator.hasMoreElements()) {
			System.out.println(courseEnumerator.nextElement());
		}
	}

	public static Enumeration<String> addCourses(Vector<String> courseVector) {
		Enumeration<String> courseEnumerator;
		courseVector.add("CMPE202");
		courseVector.add("CMPE272");
		courseVector.add("CMPE273");
		courseEnumerator = courseVector.elements();
		return courseEnumerator;
	}
}
