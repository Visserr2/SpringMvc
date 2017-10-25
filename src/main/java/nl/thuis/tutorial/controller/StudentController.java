package nl.thuis.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.thuis.tutorial.beans.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("student", new Student());
		
		return "student/student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		return "student/student-confirmation";
	}
}
