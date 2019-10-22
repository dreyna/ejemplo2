package com.examole.kenyController;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KenyController {
	@GetMapping("/keny")
	public String readAll() {
		return "ELLA NO TE AMA jaja x1000";
	}
}
