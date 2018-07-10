package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.Login;

@Controller
public class HelloWorldController {
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response,@Valid @ModelAttribute Login login, BindingResult result){
		if(result.hasErrors())
			return new ModelAndView("index").addObject("message", result.getFieldError().getDefaultMessage());
		if(!login.getName().startsWith("user"))
			return new ModelAndView("index").addObject("message", "Invalid User name or Password");
		request.getSession().setAttribute("name",login.getName());
		return new ModelAndView("hellopage");
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public ModelAndView getDetails(HttpServletRequest request, HttpServletResponse response){
		Login login =new Login();
		login.setName((String) request.getSession().getAttribute("name"));
		ModelAndView model = new ModelAndView("details");
		model.addObject("login", login);
		return model;
	}
}
