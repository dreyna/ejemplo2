package com.examole.Quezada.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Quezada")
public class QuezadaController {
	@GetMapping("/")
	public String readAll() {
		return "Quezada";
	}
}