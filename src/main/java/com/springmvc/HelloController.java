package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(name="/helloSpring", method=RequestMethod.GET)
	public String helloSpring(Model model) {
		String msg = "Hello Spring MVC";
		model.addAttribute("hello", msg);
		return "hello";
	}
	
}
