package com.thoughtfocus.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class wecomeController {
	@PostMapping("/greet.do")
	public ModelAndView greetUser(Dto user) {
	System.out.println("greeting the user");
	System.out.println(user);
	return new ModelAndView("greet.jsp","userDto",user) ;
	}
		
	}
	


