package in.Raju.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyNewYearController {
	
	@GetMapping("/goodbye")
	public String GoodBye2023() {
		String year= "Thank you 2023 & Good bye ...!";
		return year;
		
	}
	@GetMapping("/wellcome")
	public String NewYear2024() {
		String newyear="Happy New Year 2024, wishing you a year filled with new hopes, new dreams, and new Beginnings ";
		return newyear;
	}

}
