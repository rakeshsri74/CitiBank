package com.rps.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseStatusController {
	
	@GetMapping("/success")
	public ResponseEntity<String> success() {
		return new ResponseEntity<>("Success data",HttpStatus.OK);
	}
	
	@GetMapping("/notfound")
	public ResponseEntity<String> notFound() {
		return new ResponseEntity<String>("Resource not found",HttpStatus.NOT_FOUND);
	}

}
