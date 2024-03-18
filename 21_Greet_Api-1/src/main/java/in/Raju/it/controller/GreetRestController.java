package in.Raju.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Raju.it.Communication.WelcomeApiClient;

@RestController
public class GreetRestController {
	@Autowired
	private WelcomeApiClient welcomeApiClient;

	@GetMapping("/greet")
	public String getGreetMsg() {

		String welcome = welcomeApiClient.invokeWelcomeMsg();
		String msg1 = "Raju Good morning How are you";
		return msg1.concat(welcome);

	}
}
