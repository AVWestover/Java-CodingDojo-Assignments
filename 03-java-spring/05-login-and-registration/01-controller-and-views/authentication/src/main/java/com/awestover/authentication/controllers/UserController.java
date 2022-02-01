package com.awestover.authentication.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.web.bind.annotation.RestController;
import com.awestover.authentication.models.User;
import com.awestover.authentication.services.UserService;

@Controller
public class UserController {
private final UserService userService;
 
 public UserController(UserService userService) {
     this.userService = userService;
 }
 
 @RequestMapping("/registration")
 public String registerForm(@ModelAttribute("user") User user) {
     return "registrationPage.jsp";
 }
@RequestMapping("/login")
 public String login() {
     return "loginPage.jsp";
 }
 
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
// if result has errors, return the registration page (don't worry about validations just now)
	 if (result.hasErrors()) {
 		return "registration.jsp";
 	}
     // else, save the user in the database, save the user id in session, and redirect them to the /home route
		else {
			User newUser = userService.registerUser(user);
			session.setAttribute("user_id", newUser.getId());
			return "redirect:/home";
		}
 }
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
     // if the user is authenticated, save their user id in session
 	if(this.userService.authenticateUser(email, password)) {
		User loggedInUser = this.userService.getByEmail(email);
		session.setAttribute("user_id",loggedInUser.getId());
		return "redirect:/home";
	}
	 
     // else, add error messages and return the login page
 	else {
 		model.addAttribute("error", "Invalid Login!");
 		return "loginPage.jsp";
 	}
 }
 
 @RequestMapping("/home")
 public String home(HttpSession session, Model model) {
    // get user from session, save them in the model and return the home page
	Long userId = (Long) session.getAttribute("user_id");
    User user = userService.getUserById(userId);
    model.addAttribute("user",user);
   return "homePage.jsp";
 }
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
     // invalidate session
	 session.invalidate();
     // redirect to login page
	 return "redirect:/login";
 }
}
