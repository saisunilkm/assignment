package com.thoughtfocus.service;

import com.thoughtfocus.DTO.UserDTO;

public interface RegistrationService {
	public boolean validateAndSaveUser(UserDTO dto);

}
