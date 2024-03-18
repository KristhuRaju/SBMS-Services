package in.Rajuit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SbController {

	@GetMapping("/")
	public String message() {
		return "WelCome to Raju As Senior Software Engineer";
	}
}
