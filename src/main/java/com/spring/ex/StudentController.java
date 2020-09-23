package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value="form", method= RequestMethod.GET)
	public String form() {
		return "form";
	}
	@RequestMapping(value= "form", method = RequestMethod.POST)
	public String form2(@ModelAttribute("std") @Valid Student s, BindingResult result) {
		
		System.out.println(s.getName() +"/" +s.getId());
		System.out.println("result.hasErrors():"+result.hasErrors());
		String page="result";
		if(result.hasErrors()) {
			page="form";
		}
		return page;
	}
}
