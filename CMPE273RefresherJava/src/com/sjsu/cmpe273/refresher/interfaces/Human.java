package com.sjsu.cmpe273.refresher.interfaces;

public class Human implements Mammal {

	private int noOfLimbs;
	private Boolean eaten;
	private Boolean slept;

	public Boolean getEaten() {
		return eaten;
	}

	public void setEaten(Boolean eaten) {
		this.eaten = eaten;
	}

	public Boolean getSlept() {
		return slept;
	}

	public void setSlept(Boolean slept) {
		this.slept = slept;
	}

	public Human() {
		noOfLimbs = 4;
	}

	@Override
	public void eat() {
		this.setEaten(true);
		System.out.println("Eaten.");
	}

	@Override
	public void sleep() {
		this.setSlept(true);
		System.out.println("Slept.");
	}

	@Override
	public int noOfLimbs() {
		return this.noOfLimbs;
	}

	public static void main(String[] args) {
		Human h = new Human();
		h.eat();
		h.sleep();
	}

}
