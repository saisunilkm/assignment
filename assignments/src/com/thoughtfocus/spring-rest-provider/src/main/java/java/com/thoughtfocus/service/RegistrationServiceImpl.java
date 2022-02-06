package com.thoughtfocus.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtfocus.DAO.UserDAO;
import com.thoughtfocus.DTO.UserDTO;

public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean validateAndSaveUser(UserDTO dto) {
		if(dto.getPassword().equals(dto.getConfirmpassword())) {
			return dao.saveUser(dto);
		}else
			return false;
	}
	
	

}
