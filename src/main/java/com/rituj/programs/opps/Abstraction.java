package com.rituj.programs.opps;

import lombok.Data;

/**
 * Hiding the internal things and exposing what all is required for the 
 * outside world.
 * ex: <code>System.out.println();</code>
 * @author ritujkumar
 *
 */
@Data
public class Abstraction {
	
	private int age;
	private int name;
	private int sex;
	
	
}
