package com.thoughtfocus.project.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;
import com.thoughtfocus.project.dto.RegisterDTO;
import com.thoughtfocus.project.repository.DetailsRepo;
@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private DetailsRepo repo;

	@Override
	public boolean Validateregister(RegisterDTO dto) {
		try {
			if (dto != null) {
				DetailsEntity details = new DetailsEntity();
				BeanUtils.copyProperties(dto, details);
				repo.save(details);
				return true;
			}
		} catch (BeansException e) {
			e.printStackTrace();
		}
		return false;
	}
}
