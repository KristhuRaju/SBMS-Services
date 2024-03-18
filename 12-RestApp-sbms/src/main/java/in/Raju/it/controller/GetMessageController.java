package in.Raju.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMessageController {
	
	@GetMapping("/great")
	public String GoodBye2023() {
		return "Thank you 2023";
	}
	@GetMapping("/welcome")
	public ResponseEntity<String > wellcome2024(@RequestParam("name")String s){
		String msg= "Wellcome to Happy new year :2024 ";
		return new  ResponseEntity<>(msg,HttpStatus.OK);
	}

}
