package com.banking;

import org.edu.model.Acccount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping(value = "/account")
	public String accountController() {
		return "this is AccountController";
	}

	@GetMapping("/accountdetails")
	public Acccount getAccount() {
		return new Acccount("12354", "kuber", "banglore");
	}
}
