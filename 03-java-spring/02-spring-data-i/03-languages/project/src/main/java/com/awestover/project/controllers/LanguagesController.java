package com.awestover.project.controllers;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;
// import org.springframework.web.bind.annotation.RestController;
import com.awestover.project.models.Language;
import com.awestover.project.services.LanguageService;
import java.util.List;

import javax.validation.Valid;

@Controller
public class LanguagesController {
    private final LanguageService languageService;
    
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    
       @RequestMapping("/languages")
    public String index(Model model, @ModelAttribute("language") Language language) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "index.jsp";
    }

    @RequestMapping("/languages/edit/{id}")
    public String editLanguage(Model model, @PathVariable("id") Long id) {
    	Language language = languageService.getLanguageById(id);
    	if (language != null) {
    		model.addAttribute("language",language);
    		return "new.jsp";
    	}
    	else {
    		return "redirect:/languages";
    	}
    	
    	
    }
    
    @RequestMapping(value="/languages", method=RequestMethod.POST)
    public String createLanguage(Model model, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
        	List<Language> languages = languageService.allLanguages();
        	model.addAttribute("languages", languages);
            return "index.jsp";
        } else {
        	languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping(value="/languages/edit/{id}", method=RequestMethod.POST)
    public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } 
        else {
        	languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    
    
 
    
	@RequestMapping("/languages/{id}")
	public String getLanguagesid(@PathVariable("id") Long id,Model model) {
		System.out.println("languageId = "+ id);
		Language language = languageService.getLanguageById(id);
		model.addAttribute("language", language);
		return "show.jsp";
	}
	
	@RequestMapping("/languages/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        languageService.deleteLanguage(id);
        return "redirect:/languages";
    }
	//@RequestMapping(value="/languages/delete/{id}", method=RequestMethod.DELETE)
    //public String destroy(@PathVariable("id") Long id) {
    //    languageService.deleteLanguage(id);
    //    return "redirect:/languages";
    //}

}

