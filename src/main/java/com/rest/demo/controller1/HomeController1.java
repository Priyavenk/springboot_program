package com.rest.demo.controller1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rest.demo.dto.*;

@RestController
public class HomeController1 {
	@PostMapping("/Save")
	public String SaveUserData(@RequestBody Users users) {
		if (users.getUserName().equals("Priya")) {
			return "Valids UserName";
		}
		if (users.getEmail().equals("priya@gmail.com")) {
			return "Valid Emailid";
		}
		if (users.getPassword().equals("1234567")) {
			return "Valid Password";
		}
		return "INVALID DETAILS !!!";

	}
}
