package java.com.thoughtfocus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thoughtfocus.DTO.UserDTO;
import com.thoughtfocus.service.RegistrationService;

public class UserController {
	@Autowired
	private RegistrationService registrationservice;
	
	public ResponseEntity addUser
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
