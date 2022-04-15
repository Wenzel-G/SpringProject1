package com.WGQuintrix.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloController {
	
	//@GetMapping("/")
	public String message() {
		return "Hello World";
	}
	
}
