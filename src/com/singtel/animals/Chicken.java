package com.singtel.animals;

import com.singtel.bird.Bird;

public class Chicken extends WalkAnimal{
	
	

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		super.walk();
	}

		//for question: A-2-c
	@Override
	public void sing() {
		super.sing();
		System.out.println("I am chicken, Cluck, cluck");
	}


	
}
