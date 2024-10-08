package com.va.week3.inclass;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author vivek_
 * @since sept 17 2024 
 * Write 1-2 lines about the assignment1 and class here! 
 */

@NotNull
public class Order {
	
@NotNull
@Size(max=50)
	private String firstName;
	private String middleName;
	//..... add all the attributes as per the assignment..
	// create getters/setters for all
	// create ToString method for the class. 
	// create validation method.. 

	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	@Override
	public String toString() {
		return "Order [firstName=" + firstName + ", middleName=" + middleName + "]";
	}
	
}
