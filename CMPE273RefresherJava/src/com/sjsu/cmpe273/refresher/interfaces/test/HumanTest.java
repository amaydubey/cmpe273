package com.sjsu.cmpe273.refresher.interfaces.test;

import org.junit.Assert;
import org.junit.Test;

import com.sjsu.cmpe273.refresher.interfaces.Human;

public class HumanTest {

	Human human = new Human();

	@Test
	public void testEaten() {
		human.eat();
		Assert.assertTrue(human.getEaten());
	}
	
	@Test
	public void testSlept() {
		human.sleep();
		Assert.assertTrue(human.getSlept());
	}

}
