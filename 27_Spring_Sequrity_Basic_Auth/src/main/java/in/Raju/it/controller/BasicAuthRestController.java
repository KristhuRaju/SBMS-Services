package in.Raju.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthRestController {

	@GetMapping("/contact")
	public String contactUs() {
		return "Contact Number is : + 91: 8465022515";
	}
	@GetMapping("/secure")
	public String aboutUs() {
		return "Spring Farame work is very lucky beacuse Spring Security concept is secure our API's ";
	}
	
	@GetMapping("/greet")
	public String greeat() {
		return"Well come to Spring Security" ;
	}
	
}
