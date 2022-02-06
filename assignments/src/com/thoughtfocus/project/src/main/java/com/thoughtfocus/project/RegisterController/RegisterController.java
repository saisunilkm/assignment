package com.thoughtfocus.project.RegisterController;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;
import com.thoughtfocus.project.dto.RegisterDTO;
import com.thoughtfocus.project.repository.DetailsRepo;

@RestController
public class RegisterController {
	@Autowired
	DetailsRepo repo;

	@PostMapping("/register")
	String register(@RequestBody RegisterDTO dto) {
		if (dto != null) {
			DetailsEntity detailsEntity = new DetailsEntity();
			BeanUtils.copyProperties(dto, detailsEntity);
			repo.save(detailsEntity);
			return "Data saved successfully"+dto.getName();
		} else {
			return "data not saved";
		}
	}
	
	

}
