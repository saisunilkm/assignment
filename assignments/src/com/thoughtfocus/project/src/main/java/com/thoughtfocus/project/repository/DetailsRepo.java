package com.thoughtfocus.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;

public interface DetailsRepo extends JpaRepository<DetailsEntity,Integer> {
	DetailsEntity getByName(String name);
	DetailsEntity getByEmail(String email);
	DetailsEntity getByContact(long contact);
	DetailsEntity getByNameAndPassword(String name,String password);

}
