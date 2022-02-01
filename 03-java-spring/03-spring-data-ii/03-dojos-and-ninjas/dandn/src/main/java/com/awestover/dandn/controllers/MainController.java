package com.awestover.dandn.controllers;
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
import com.awestover.dandn.models.Dojo;
import com.awestover.dandn.services.DojoService;
import com.awestover.dandn.models.Ninja;
import com.awestover.dandn.services.NinjaService;

import java.util.List;

import javax.validation.Valid;

@Controller
public class MainController {
    private final DojoService dojoService;
	private final NinjaService ninjaService;
    
    public MainController(DojoService dojoService, NinjaService ninjaService) {
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }
    
    // PAGES
    
    @RequestMapping("/dojos/new")
    public String dojos(Model model, @ModelAttribute("dojo") Dojo dojo) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "dojos.jsp";
    }
    
	@RequestMapping("/ninjas/new")
	public String newNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "ninjas.jsp";
	}
    
	@RequestMapping("/dojos/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.getDojoById(id));
		return "show.jsp";
	}
	
    
    //POST
    
    @RequestMapping(value="/dojos/new", method=RequestMethod.POST)
    public String createDojo(Model model, @Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
        	List<Dojo> dojos = dojoService.allDojos();
        	model.addAttribute("dojos", dojos);
            return "dojos.jsp";
        } else {
        	dojoService.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }
    
    @RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
    public String createNinja(Model model, @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
        	List<Ninja> ninjas = ninjaService.allNinjas();
        	model.addAttribute("ninjas", ninjas);
            return "ninjas.jsp";
        } else {
        	ninjaService.createNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }
    
    
}
