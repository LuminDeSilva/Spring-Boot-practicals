package vau.fas.dps.it.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vau")

public class MyController {
	@GetMapping("/msg")
	public String firstMessage() {
		return "Welcome to SpringBoot";
	}
	
	@GetMapping("/name")
	public String nameMessage() {
		return "Welcome to Everyone";
	}
}
