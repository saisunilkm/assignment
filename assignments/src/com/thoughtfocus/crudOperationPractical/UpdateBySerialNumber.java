package com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical;

public class UpdateBySerialNumber extends RuntimeException{

	@Override
	public String getMessage() {
		return "Invalid Serial Number";
	}
	

}
