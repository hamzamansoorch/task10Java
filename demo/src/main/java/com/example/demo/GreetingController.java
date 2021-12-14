/*package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	private String message ="Hello, User";
	//int id =1;
	@GetMapping
	public Greetings getGreeting(@RequestParam(value="name",required = false, defaultValue = "User") String message)
	{
		
		Greetings g = new Greetings(id, "Hello, " +message);
		id = id+1;
		return g;
		
	}

}
*/