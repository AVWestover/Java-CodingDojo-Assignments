package com.awestover.dojosurvey.controllers;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
// import org.springframework.web.bind.annotation.RestController;
@Controller
public class MainControllers {
	@RequestMapping ("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/result")
	public String success(@ModelAttribute("name") String name, @ModelAttribute("location") String location,
			@ModelAttribute("language") String language, @ModelAttribute("comment") String comment, Model model) {
		System.out.println(name);
		System.out.println(location);
		System.out.println(language);
		System.out.println(comment);
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "display.jsp";
	}
	@RequestMapping(path = "/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="name") String name, @RequestParam(value="location") String location,
			@RequestParam(value="language") String language, @RequestParam(value="comment") String comment,
			RedirectAttributes redirectAttributes) {
		return "redirect:/result";
	}
	@RequestMapping(path = "/back", method=RequestMethod.POST)
	public String back() {
		return "redirect:/";
	}
}
