package com.singtel.animals;

import java.lang.reflect.Method;

import com.singtel.fish.Clownfish;
import com.singtel.fish.Dolphins;
import com.singtel.fish.Fish;
import com.singtel.fish.Shark;
import com.singtel.metamorphosisInsect.Butterfly;
import com.singtel.metamorphosisInsect.Frog;

/**
 * 
 * @author JuanLu
 *
 */

public class Solution {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		Rooster rooster = new Rooster();
		Parrot parrort = new Parrot();
		Fish fish = new Fish();
		Shark shark = new Shark();
		Clownfish clownfish = new Clownfish();
		Dolphins dolphins = new Dolphins();
		Frog frog = new Frog();
		Butterfly butterfly = new Butterfly();
		
		Animal[] animals = new Animal[]{
				duck,
				chicken,
				rooster,
				parrort,
				fish,
				shark,
				clownfish,
				dolphins,
				frog,
				butterfly
				};
	    int flyint = 0;
	    int walkint = 0;
	    int swimint = 0;
	    int singint = 0;
	    
	    for (int i=0; i<animals.length; i++){
	    	
	    	if(animals[i] instanceof Bird &&!(animals[i] instanceof  Parrot)){
	    	    walkint++;
	    	    singint++;
	    	}else if (animals[i] instanceof Fish ){
	    		swimint++;
	    	}else if (animals[i] instanceof Frog ){
	    		swimint++;
	    		walkint++;
	    	}else if (animals[i] instanceof  Butterfly||animals[i] instanceof  Parrot){
	    		flyint++;
	    	}
	    }
	  	
		System.out.println("The animal can fly: " + flyint);
		System.out.println("The animal can walk: "+ walkint);
		System.out.println("The animal can sing: "+singint);
		System.out.println("The animal can swim: "+ swimint);
		
		}
	
}
