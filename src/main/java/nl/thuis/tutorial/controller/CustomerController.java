package nl.thuis.tutorial.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nl.thuis.tutorial.beans.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// This method is called for every webrequest. Preprocess every String form data
	// Trims whitespaces in the String-objects
	@InitBinder
	public void initBinderTrimStrings(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}

	@RequestMapping("/showform")
	public String showform(Model model) {

		model.addAttribute("customer", new Customer());
		return "customer/customer-form";
	}

	@RequestMapping("/processform")
	public String processform(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult result) {

		if (result.hasErrors()) {
			return "customer/customer-form";
		}

		return "customer/customer-confirmation";
	}
}
