package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("/hello")
	public String helloGFG() {
		return "Hello, World!";
	}
}
