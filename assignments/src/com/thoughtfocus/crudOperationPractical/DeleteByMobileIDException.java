package com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical;

public class DeleteByMobileIDException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Invalid MobileID";
	}
	

}
