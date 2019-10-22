package com.examole.kenyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keny")
public class KenyController {
	@GetMapping("/")
	public String readAll() {
		return "Soy Keny";
	}
}
