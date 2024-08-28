package com.aspect.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@PostMapping("/testAop")
	public void testAop() {

	}
}
