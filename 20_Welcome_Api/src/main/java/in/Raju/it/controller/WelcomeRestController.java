package in.Raju.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/welcome")
	public String getwelcome() {
		
		String port= environment.getProperty("server.port");
		//environment.
		String msg = " =*=*= Welcome to Software (" + port + ")";
		return msg;
	}
}
