package com.sjsu.cmpe273.refresher.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseIterator {

	public static void main(String[] args) {
		List<String> courseList = new ArrayList<String>();
		Iterator<String> courseIterator = addCourses(courseList);
		System.out.println("The list of courses is as follows:");
		while (courseIterator.hasNext()) {
			System.out.println(courseIterator.next());
		}
	}

	public static Iterator<String> addCourses(List<String> courseList) {
		courseList.add("CMPE202");
		courseList.add("CMPE272");
		courseList.add("CMPE273");
		Iterator<String> courseIterator = courseList.iterator();
		return courseIterator;
	}

}
