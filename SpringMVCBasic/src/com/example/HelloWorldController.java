package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.Login;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login){
		request.getSession().setAttribute("name",login.getPassword());
		ModelAndView model = new ModelAndView("hellopage");
		return model;
	}
	
	@RequestMapping(value="/details", method=RequestMethod.GET)
	public ModelAndView getDetails(HttpServletRequest request, HttpServletResponse response){
		Login login =new Login();
		login.setName((String) request.getSession().getAttribute("name"));
		System.out.println("@@@@@@@@@@@@@"+login.getName());
		ModelAndView model = new ModelAndView("details");
		model.addObject("login", login);
		return model;
	}
}
