package com.thoughtfocus.project.loginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtfocus.project.detailsEntity.DetailsEntity;
import com.thoughtfocus.project.services.LoginService;
@RestController
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	String login(@RequestParam String name,@RequestParam String password) {
		DetailsEntity detailsentity = null;
		try {
			if(!name.equals("")&& !password.equals("")&&name != null && password !=null ) {
				detailsentity = loginService.validateAndLogin(name, password);
				logger.info(detailsentity.toString());
				return "Login Successful";
			}else {
				throw new invalidException("Invalid");
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return "Invalid";
	}
		

}
