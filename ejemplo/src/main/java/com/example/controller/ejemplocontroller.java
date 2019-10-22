package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/richeti")
public class ejemplocontroller {
	@Autowired
	@GetMapping
	
	public String get(){
		
		return "el malote";
	}
}
