package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeyCont {

	@GetMapping("home-url")
	public String gotohome() {
		return "homepage";
	}
}
