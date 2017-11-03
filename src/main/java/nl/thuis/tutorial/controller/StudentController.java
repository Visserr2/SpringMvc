package nl.thuis.tutorial.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.thuis.tutorial.beans.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
    @Value("#{countries}") 
    private Map<String, String> countryOptions;
	
	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		
		// add student to model
		theModel.addAttribute("student", new Student());

		// add countryOptions to model
		theModel.addAttribute("countryOptions", countryOptions); 
		
		return "student/student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		return "student/student-confirmation";
	}
}
