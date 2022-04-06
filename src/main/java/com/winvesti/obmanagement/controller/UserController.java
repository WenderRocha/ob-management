package com.winvesti.obmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.winvesti.obmanagement.model.User;
import com.winvesti.obmanagement.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
	
	private final UserRepository userRepository;

	@GetMapping(value = "/cadastro")
	public String register() {
		return "default/user/register";
	}
	
	@PostMapping(value = "/cadastrar")
	public String save(User user) {
		userRepository.save(user);
		return "default/user/register";
	}
}
