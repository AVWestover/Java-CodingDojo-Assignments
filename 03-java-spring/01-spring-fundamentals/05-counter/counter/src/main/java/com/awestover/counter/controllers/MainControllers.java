package com.awestover.counter.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RestController;
@Controller
public class MainControllers {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer num = (int) session.getAttribute("count");
			num++;
			session.setAttribute("count", num);
			
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String display(Model model, HttpSession session) {
		model.addAttribute("count", session.getAttribute("count") );
		return "display.jsp";
	}

}
