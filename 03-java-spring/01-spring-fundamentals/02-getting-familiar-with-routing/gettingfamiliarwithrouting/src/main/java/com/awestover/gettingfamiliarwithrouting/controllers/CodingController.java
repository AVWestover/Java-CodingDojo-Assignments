package com.awestover.gettingfamiliarwithrouting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/coding")
public class CodingController {
	//1
	@RequestMapping("")
    public String codinggreet() {
		return "Hello Coding Dojo";
    }
    //2
	@RequestMapping("/python")
	public String pythongreet() {
		return "Python/Django was awesome!";
	}
    //3
	@RequestMapping("/java")
	public String javagreet() {
		return "Java/Spring is better!";
	}
}
