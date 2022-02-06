package com.thoughtfocus.project.updateController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.project.services.UpdateDobDTO;
import com.thoughtfocus.project.services.UpdateGenderDTO;
import com.thoughtfocus.project.services.UpdatePasswordDTO;
import com.thoughtfocus.project.services.UpdateService;

@RestController
public class UpdateController {
	@Autowired
	private UpdateService updateService;
	
	@PostMapping("/updatedob")
	String updatedob(@RequestBody UpdateDobDTO dobdto) {
		try {
			boolean status = updateService.updateDobUsingName(dobdto);
			if(status) {
				return "Data updated";
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return "Data not updated";
	}
	
	@PostMapping("/forgotpassword")
	String updatepassword(@RequestBody UpdatePasswordDTO psdto) {
		try {
			boolean status = updateService.updatePasswordUsingEmail(psdto);
			if(status) {
				return "Data Updated";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Data not updated";
	}
	
	@PostMapping("/updategender")
	String updategender(@RequestBody UpdateGenderDTO gendto) {
		try {
			boolean status = updateService.updateGenderUsingContact(gendto);
			if(status) {
				return "Data Updated";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Data not Updated";
	}

}
