package com.thoughtfocus.project.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;
import com.thoughtfocus.project.repository.DetailsRepo;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private DetailsRepo repo;
	
	Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	
	@Override
	public DetailsEntity validateAndLogin(String name,String Password) {
		DetailsEntity entity = null;
		try {
			if(name.length()>2 && Password.length()>2) {
				entity = repo.getByNameAndPassword(name, Password);
			}else {
				throw new InvalidException("Name And Password must be more than 2");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			
		}
		return entity;
	}


}
