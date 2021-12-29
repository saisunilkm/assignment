package com.thoughtfocus.CRUDLinkedHashSet;

public class DeletedByMobileIDException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Invalid MobileID";
	}

}
