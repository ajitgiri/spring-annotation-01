package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddminController {

	@RequestMapping(value = "/addminH", method = RequestMethod.POST)
	public ModelAndView addminHome() {
		String addmn = "addminHome";
		System.out.println("hello-------------");
		return new ModelAndView(addmn, "msg", "mssg");
	}

	@RequestMapping(value = "/userHome", method = RequestMethod.GET)
	public ModelAndView userH() {
		return new ModelAndView("userHome");
	}

}
