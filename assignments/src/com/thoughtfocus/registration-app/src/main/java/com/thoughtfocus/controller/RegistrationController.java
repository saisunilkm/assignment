package com.thoughtfocus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thoughtfocus.DTO.UserDTO;
import com.thoughtfocus.service.RegistrationService;
@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationservice;
	
	public RegistrationController() {
		System.out.println(this.getClass().getSimpleName()+ "obj created...");
		
	}
	@PostMapping("/reg.do")
	public ModelAndView registerUser(UserDTO user) {
		boolean saveStatus = registrationservice.validateAndSaveUser(user);
		ModelAndView view = new ModelAndView();
		if(saveStatus) {
			view.setViewName("/success.jsp");
			view.addObject("status","Registration successful....");
		}else {
			view.setViewName("/error.jsp");
			view.addObject("status","Registration failed...");
		}
		return view;
	}
}
