package com.example;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
	
	//add an initBinder to convert trim input string	
	//remove leading and trailing whitespace
	//resolve issue for our validation
	//This method is executed before any RequestMapping. Remove white spaces to String vars.
	//Pre-process every string form data
	//Remove white spaces , if the string only has white spaces .. trim it yo null
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,stringTrimmer);
	}//Close initBinder

	@RequestMapping("showForm")
	public String showFormStudent(Model model) {
		
		//Creating a student object
		Student student = new Student();
		
		//Add student object to the model
		model.addAttribute("student", student);
		
		return "studentForm";
	}//Close showFormStudent method.
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("student")Student student, BindingResult bindingResult) {	
		//System.out.println("First name : "+student.getFirstName());
		
		if (bindingResult.hasErrors()) {
			return "studentForm";
		}//Close if.
		else {
			return "studentConfirmation";
		}//Close else.
		
	}//Close processForm
	
	
}//Close StudentController class
