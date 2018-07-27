package com.singtel.animals;

/**
 * 
 * @author JuanLu
 *
 */

public class Bird extends Animal{
	
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("I am bird, I am walking");
	}

	public void fly() {
		System.out.println("I am flying");
		}
	
	// Implement sing to Bird, for question A-1
	public void sing() {				
		System.out.println("I am singing");
		}
}
