package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyControler {

	// Need a controller method to show the initial HTML form
	@RequestMapping("showForm")
	public String showForm() {
		return "helloWorldForm";
	}// CLose showForm method.

}// Close SillyControler class.
