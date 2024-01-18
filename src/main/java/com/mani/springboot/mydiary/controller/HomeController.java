package com.mani.springboot.mydiary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	public String homepage (Model model)
	{
		return "index";
	
	}

}
