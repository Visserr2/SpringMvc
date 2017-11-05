package nl.thuis.tutorial.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.thuis.tutorial.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
    @Value("#{countries}") 
    private Map<String, String> countryOptions;
    @Value("#{favoriteLanguages}") 
    private Map<String, String> languageOptions;
    @Value("#{operatingSystems}") 
    private Map<String, String> osOptions;
	
	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		
		// add student to model
		theModel.addAttribute("student", new Student());

		// add valuelists to model
		theModel.addAttribute("countryOptions", countryOptions); 
		theModel.addAttribute("languageOptions", languageOptions);
		theModel.addAttribute("osOptions", osOptions);
		
		return "student/student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		return "student/student-confirmation";
	}
}
