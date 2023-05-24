package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello/{username}")
	public ResponseEntity<String>  sayHello(@PathVariable String username) {
		return ResponseEntity.ok("Hello..... "+username);
		
	}

}
