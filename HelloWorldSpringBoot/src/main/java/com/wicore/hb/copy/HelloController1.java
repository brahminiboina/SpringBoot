package com.wicore.hb.copy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {
	@RequestMapping("/hello")
	public String SayHello() {
		return "First Maven using SpringBoot";
	}
}
