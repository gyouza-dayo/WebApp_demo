package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	//http://localhost:8080/?name=●●● でアクセスされる
	@RequestMapping(value = "/")
	private String Hello(@RequestParam(value = "name", defaultValue = "World!") String name) {
		return String.format("Hello %s!", name);
	}
}
