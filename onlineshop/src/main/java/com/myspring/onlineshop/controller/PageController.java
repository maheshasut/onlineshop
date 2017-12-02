package com.myspring.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/Home","/index"})
	
	public ModelAndView index(){
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("Greeting","Welcome To Spring MVC");
		return mv;
	}
	
}
