package com.example.ejemplo.carrizo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrizo")
public class CarrizoController {

	@GetMapping("/")
	public String carrizo(){
		return "Soy Carrizo";
	}
	
}
