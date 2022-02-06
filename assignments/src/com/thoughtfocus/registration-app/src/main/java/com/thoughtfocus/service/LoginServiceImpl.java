package com.thoughtfocus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.DAO.UserDAO;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean authenticateUser(String username,String password) {
		if(username != null && password != null) {
			return dao.authenticate(username, password);
		}else {
			return false;
		}
	}
	

}
