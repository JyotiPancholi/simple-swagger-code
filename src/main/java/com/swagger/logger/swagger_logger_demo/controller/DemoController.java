package com.swagger.logger.swagger_logger_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value = "/test")
	public String getAllEmpployee() {
		return "Hello";
	}
}
