package com.osloAI.backend.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public String saudacaoService() {
		return "Hello";
	}
	public String byeService() {
		return "Bye";
		
	}
	
	public String nameService(String name) {
		return "Hello "+name+"!";
	}

}
