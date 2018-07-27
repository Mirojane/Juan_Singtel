package com.singtel.fish;

import com.singtel.animals.Animal;

public class Fish extends Animal{
	public String color;
	public String body ;
	
	public void attack(boolean i) {
		if (i == false) {
			System.out.println("mild fish, no attack");
		}
		else if (i==true) {
			System.out.println("aggressive fish, attack");
		}
	}


	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
	
	

}
