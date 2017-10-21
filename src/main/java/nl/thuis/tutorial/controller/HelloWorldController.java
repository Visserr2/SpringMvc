package nl.thuis.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processformtwo")
	public String processFormWithCapitals(@RequestParam("studentName") String theName, Model model) {

		/* This happens behind the scenes when using @RequestParam("studentName")
		 * (Request Param Binding) request.getParameter("studentName");
		 */

		String result = "Yo! " + theName.toUpperCase();

		// Add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
