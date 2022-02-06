package com.thoughtfocus.project.services;

public interface UpdateService {
	public boolean updateDobUsingName(UpdateDobDTO dondto);
	public boolean updatePasswordUsingEmail(UpdatePasswordDTO pasdto);
	public boolean updateGenderUsingContact(UpdateGenderDTO gendto);
}
