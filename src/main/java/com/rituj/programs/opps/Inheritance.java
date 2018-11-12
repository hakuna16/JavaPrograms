package com.rituj.programs.opps;

import lombok.Data;

/**
 * This class tells us about the is relationship of the objects. So basically
 * two types of relationship is there isA and hasA
 * 
 * @author ritujkumar
 *
 */
@Data
public class Inheritance {

	private String vehcileType;
	private String color;
	private Integer numberOfTyres;
	
	public String setVehcileType(String vehcileType) {
		
		return this.vehcileType;
		
	}

}

class Car extends Inheritance {

	Car car = new Car();
	Inheritance inheritance = new Inheritance();

}
