package com.example.ejemplo.nick;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nick")
public class nickController {
	@GetMapping("/")
	public String nick() {
		return "{usuario:nick, password:holamundo}, {usuario:atencio, password:carrizo}";
	}
}