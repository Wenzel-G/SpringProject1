package com.WGQuintrix.helloworld.entity;

import lombok.Data;

@Data
public class Car {
	
	private String make;
	private String model;
	private int year;
	
	
	public Car() {
		
	}
	
	public Car(String the_make, String the_model, int the_year ) {
		this.make = the_make;
		this.model = the_model;
		this.year = the_year;
		
		
	}
	
	

}
