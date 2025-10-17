package com.osloAI.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osloAI.backend.service.UserService;



@RequestMapping("/test")
@RestController
public class UserController {
	
	@Autowired
	private UserService userS;
	
	@GetMapping("/hello")
	public String hello() {
		return userS.saudacaoService();
	}
	
	@GetMapping("/bye")
	public String bye() {
		return userS.byeService();
	}
	
	@GetMapping("/name/{name}")
	public String name(@PathVariable String name) {
		return userS.nameService(name);
	}
	
}
