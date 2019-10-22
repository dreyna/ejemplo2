package com.example.ejemplo.sembenavente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ella")
public class SemController {
	@GetMapping("/nomequiere")
	public String getVerdad() {
		return "eso es verdad";
	}
	
}
