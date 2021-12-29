package com.wicore.encrypt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class SpringPasswordEncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPasswordEncApplication.class, args);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "Bhanu";
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println();
		System.out.println("Password is         : " + password);
		System.out.println("Encoded Password is : " + encodedPassword);
		
		boolean isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "   isPasswordMatch    : " + isPasswordMatch);

		password = "Bhanu";
		isPasswordMatch = passwordEncoder.matches(password, encodedPassword);
		System.out.println("Password : " + password + "           isPasswordMatch    : " + isPasswordMatch);
	
	}

}
