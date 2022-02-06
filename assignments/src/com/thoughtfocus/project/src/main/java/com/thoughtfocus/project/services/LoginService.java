package com.thoughtfocus.project.services;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;

public interface LoginService {
	public DetailsEntity validateAndLogin(String name,String Password);


}
