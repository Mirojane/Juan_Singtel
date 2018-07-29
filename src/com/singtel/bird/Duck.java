package com.singtel.bird;

public class Duck extends Bird{
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}

	// For question A-2-a
	@Override
	public void sing() {
		super.sing();
		System.out.println("I am Duck, Quack, quack");
	}
	//For question A-2-b
	public void swim() {
		System.out.println("I am Duck, I can swim");
	}
}
