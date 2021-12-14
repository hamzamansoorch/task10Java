package com.example.demo;

import java.net.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/index")
public class BaseController {
	
	@GetMapping
	public String hello()
	{
		return "Hello Spring Boot Test" ;
		
	}

	  public ResponseEntity Statuscode(){

	        return new ResponseEntity<>("Status code", HttpStatus.OK);
	    }


}
