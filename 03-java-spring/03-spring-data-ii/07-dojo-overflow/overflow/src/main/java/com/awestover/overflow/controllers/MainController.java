package com.awestover.overflow.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.web.bind.annotation.RestController;
import com.awestover.overflow.models.Question;
//import com.awestover.overflow.models.Tag;
import com.awestover.overflow.models.Answer;
import com.awestover.overflow.services.AppService;

import java.util.List;

import javax.validation.Valid;

@Controller
public class MainController {
    private final AppService appService;
    
    public MainController(AppService appService) {
        this.appService = appService;
    }
    // / redirects to dashboard
 	@RequestMapping( value="/", method=RequestMethod.GET )
 	public String index() { 
 		return "redirect:/questions"; 
 	}
 	
 	//DASHBOARD
    @RequestMapping("/questions")
    public String dashboard(Model model, @ModelAttribute("question") Question question) {
        List<Question> questions = appService.getAllQuestions();
        model.addAttribute("questions", questions);
        return "dashboard.jsp";
    }
    
    //NEW QUESTION
    @GetMapping("/questions/new")
    public String newQ(@ModelAttribute("question") Question question) {
    	return "newquestion.jsp";
    }
    
    @PostMapping("/questions/new")
    public String createQ(@Valid @ModelAttribute("question") Question question, BindingResult result) {
    	
    	if (result.hasErrors()) {
            return "newquestion.jsp";
        } 
    	else {
    		appService.createQuestion(question);
            return "redirect:/questions";
        }
    }
    
    //QUESTION PROFILE
    @GetMapping("/questions/{id}")
    public String questionsProfile(@PathVariable("id") Long id, Model model, @ModelAttribute("answer") Answer answer) {
    	Question questionThis = appService.getQuestionById(id);
    	model.addAttribute("question", questionThis);
    	return "showquestion.jsp";
    }
    
    @PostMapping("/questions/answering")
    public String answeringQuestion(@Valid @ModelAttribute("answer") Answer answer, BindingResult result) {
    	
    	if (result.hasErrors()) {
    		return "showquestion.jsp";
    	}
    	else {
    		Answer newAnswer = appService.createAnswer(answer);
    		return "redirect:/questions/"+newAnswer.getQuestion().getId();
    	}
    }
    
    //


}
