package com.awestover.hellohuman.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class MainControllers {
	@RequestMapping("/")
	public String defaulthello() {
		return "Hello Human";
	}
	@RequestMapping("name={part1}")
	public String namehello(@PathVariable("part1") String name) {
		return "Hello " + name;
	}

}
