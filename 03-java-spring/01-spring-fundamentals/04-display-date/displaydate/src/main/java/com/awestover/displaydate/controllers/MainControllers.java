package com.awestover.displaydate.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import java.util.*;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.RestController;
@Controller
public class MainControllers {
	public Date getDate() {
		Date date = new Date();
		return date;
	}
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String daterend( Model model) {
		model.addAttribute("date", getDate() );
		return "date.jsp";
	}
	@RequestMapping("/date")
	public String timerend( Model model) {
		model.addAttribute("time", getDate() );
		return "time.jsp";
	}

}
