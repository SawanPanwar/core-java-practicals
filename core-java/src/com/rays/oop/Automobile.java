package com.rays.oop;

public class Automobile {

	private String color;

	private int speed;

	private String make;

	public static final int NO_OF_GEARS = 6;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void applyBrake() {
		System.out.println("Brake applied. Vehicle slowing down...");
		speed = 0;
	}

	public void changeGear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("Gear changed to: " + gear);
		} else {
			System.out.println("Invalid gear! Please select between 1 and " + NO_OF_GEARS);
		}
	}

	public void accelerate(int accelerateBy) {
		if (accelerateBy > 0) {
			speed += accelerateBy;
			System.out.println("Accelerating... Current speed: " + speed + " km/h");
		} else {
			System.out.println("Invalid acceleration value!");
		}
	}
}
