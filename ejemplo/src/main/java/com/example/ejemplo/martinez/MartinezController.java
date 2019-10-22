package com.example.ejemplo.martinez;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/martinez")
public class MartinezController {

	@GetMapping("/")
	public String martinez() {

		return "Soy Martinez";
	}

}
