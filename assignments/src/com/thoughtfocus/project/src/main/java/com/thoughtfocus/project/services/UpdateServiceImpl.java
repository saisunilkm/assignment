package com.thoughtfocus.project.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;
import com.thoughtfocus.project.repository.DetailsRepo;
@Service
public class UpdateServiceImpl implements UpdateService{
	@Autowired
	private DetailsRepo repo;
	
	@Override
	public boolean updateDobUsingName(UpdateDobDTO dobdto) {
		try {
			DetailsEntity detailsEntity = repo.getByName(dobdto.getName());
			if(dobdto != null) {
				detailsEntity.setDOB(dobdto.getDOB());
				repo.save(detailsEntity);
				return true;
			}
		}catch (BeansException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updatePasswordUsingEmail(UpdatePasswordDTO pasdto) {
		try {
			DetailsEntity detailsEntity = repo.getByEmail(pasdto.getEmail());
			if(pasdto!=null) {
				detailsEntity.setPassword(pasdto.getPassword());
				repo.save(detailsEntity);
				return true;
			}
		}catch(BeansException e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updateGenderUsingContact(UpdateGenderDTO gendto) {
		try {
			DetailsEntity detailsEntity = repo.getByContact(gendto.getContact());
			if(gendto!=null) {
				detailsEntity.setGender(gendto.getGender());
				repo.save(detailsEntity);
				return true;
			}
		}catch (BeansException e) {
			e.printStackTrace();
			
		}
		return false;
	}


}
