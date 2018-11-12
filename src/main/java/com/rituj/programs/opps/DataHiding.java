package com.rituj.programs.opps;

import lombok.Data;

/**
 * This program implements data hiding concepts for a given class.
 * By making the members private we can hide the data from the outside
 * world
 * @author ritujkumar
 *
 */
@Data
public class DataHiding {

	private Integer number;
	private Integer age;
	public String name;
	
}

/**
 * Here also we can not access the private members of the class.
 * But we can access name variable as it is public.
 * @author ritujkumar
 *
 */
class Access extends DataHiding{
	Access access = new Access();
}
