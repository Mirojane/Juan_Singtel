package com.singtel.service;

import com.singtel.animals.Animal;

@Path("/hello")
public class AnimalService {

	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public Animal sayPlainTextHello() {
			Animal  animal = new Animal();
			return animal;
	  }
	

}
