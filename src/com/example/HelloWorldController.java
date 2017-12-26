package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//Need a controller method to show the initial HTML form
	@RequestMapping("showForm")
	public String showForm() {
		return "helloWorldForm";
	}//CLose showForm method.
	
	//Need a controller method to process the HTML form
	@RequestMapping("processForm")
	public String processForm() {
		return "helloWorld";
	}//Close showForm method.
	
	//New controller method to read data from form and add data to the model.
	@RequestMapping("processFromVersionTwo")
	public String processFromVersionTwo(HttpServletRequest request, Model model) {
		
		//Read the request parameter from HTML form
		String name = request.getParameter("studentName");
		model.addAttribute("message", "UpperCase "+name.toUpperCase());
		return "helloWorld";
		
	}//Close processFromVersionTwo method.
	
	@RequestMapping("processFromVersionThree")
	public String processFromVersionThree(@RequestParam("studentName")String name, Model model) {
		
		//Read the request parameter from HTML form
		//String name = request.getParameter("studentName");
		model.addAttribute("message", "Hey my friend from V3 "+name.toUpperCase());
		return "helloWorld";
		
	}//Close processFromVersionTwo method.	
	
}//Close HelloWorldController class.
