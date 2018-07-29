package com.singtel.bird;

public class Parrot extends Bird {

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

	
	public void sing(String neighbor, String sound) {
				
		System.out.println("I am parrot with"+ neighbor+"  "+ sound);
		
	}
	
	

}
