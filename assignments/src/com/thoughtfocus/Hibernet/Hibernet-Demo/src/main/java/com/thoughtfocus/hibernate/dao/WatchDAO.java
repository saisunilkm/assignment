package com.thoughtfocus.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import com.thoughtfocus.hibernate.dto.WatchDTO;

public class WatchDAO {
	List <WatchDTO> watchDTO = new ArrayList<>();
	
	public void savedata(WatchDTO dto) {
		watchDTO.add(dto);
	}

}
