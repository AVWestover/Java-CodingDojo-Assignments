package com.awestover.gettingfamiliarwithrouting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/{part1}")
public class DojoController {
	//1
	@RequestMapping("")
	public String dojogreetone(@PathVariable("part1") String dojostr) {
		return "The " + dojostr + " is awesome!";
	}
	//2
	@RequestMapping("/burbank") 
	public String dojogreetburbank(@PathVariable("part1") String dojostr) {
		return "Burbank " + dojostr+ " is located in Southern California";
	}
	//3
	@RequestMapping("/san-jose")
	public String dojogreetsanjose(@PathVariable("part1") String dojostr) {
		return "SJ " + dojostr + " is the headquarters";
	}
}