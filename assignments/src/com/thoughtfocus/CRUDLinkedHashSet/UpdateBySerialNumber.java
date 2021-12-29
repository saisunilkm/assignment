package com.thoughtfocus.CRUDLinkedHashSet;

public class UpdateBySerialNumber extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid Serial Number";
	}

}
