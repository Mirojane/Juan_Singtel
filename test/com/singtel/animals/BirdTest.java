package com.singtel.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class BirdTest {

	@Test
	public void test() {
		Bird birdtest = new Bird();
		birdtest.sing();
		birdtest.walk();
	}
	
	@Test
	public void test1() {
		Animal anmtest = new Animal();
		anmtest.walk();
	}

}
