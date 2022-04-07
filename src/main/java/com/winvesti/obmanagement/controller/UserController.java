package com.winvesti.obmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView save(User user) {
		userRepository.save(user);
		
		ModelAndView view = new ModelAndView("default/index");
		Iterable<User> usersIt = userRepository.findAll();
		view.addObject("users", usersIt);
		
		return view;
	}
	
	@GetMapping(value = "/usuarios")
	public ModelAndView users() {
		ModelAndView andView = new ModelAndView("default/user/register");
		Iterable<User> usersIt = userRepository.findAll();
		andView.addObject("users", usersIt);
		return andView;
	}
}
