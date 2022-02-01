package com.awestover.thecode.controllers;
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
	public String index(@ModelAttribute("errors") String errors, Model model) {
		System.out.println(errors);
		model.addAttribute("errors", errors);
		return "index.jsp";
	}
	@RequestMapping("/code")
	public String success() {
		return "success.jsp";
	}
	@RequestMapping(path = "/trycode", method=RequestMethod.POST)
	public String trycode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		String codestr = new String("bushido");
		if (!code.equals(codestr)) {
			redirectAttributes.addFlashAttribute("errors", "You must train harder");
			return "redirect:/";
		}
		else {
			redirectAttributes.addFlashAttribute("errors", " ");
			return "redirect:/code";
		}
		
	}
}
