package com.rest.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/users")
	public Map<String, String> getUsers() {
		Map<String, String> user = new HashMap<>();

		user.put("Name", "Priya");
		user.put("Age", "20");
		user.put("Address", "Chennai");
		return user;
	}

	@GetMapping("/age")
	public int getAge() {
		return 20;
	}

//	@GetMapping("/mark")
//	public int addmark(@RequestParam("a")int op1,@RequestParam("b")int op2) {
//		return op1+op2;
//		
//	}
	@GetMapping("/addition/{a}/{b}")
	public int addnumber(@PathVariable("a") int op1, @PathVariable("b") int op2) {
		return op1 + op2;
	}

	@GetMapping("/subtraction")
	public int subnumber(@RequestParam("a") int op3, @RequestParam("b") int op4) {
		return op3 - op4;
	}

	@GetMapping("/multiplication/{a}/{b}")
	public int mulnumber(@PathVariable("a") int op3, @PathVariable("b") int op4) {
		return op3 * op4;
	}

}
