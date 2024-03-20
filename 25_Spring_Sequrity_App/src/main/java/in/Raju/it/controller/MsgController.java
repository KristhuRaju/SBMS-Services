package in.Raju.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/msg")
	public String getMsg() {
		return "Wel come to Spring Sequrity";
	}
}
