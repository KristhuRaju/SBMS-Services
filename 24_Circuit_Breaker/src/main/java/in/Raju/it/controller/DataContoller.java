package in.Raju.it.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataContoller {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDb", name ="raju")
	public String getData() {
		
		System.out.println("Raju Method Caled");
		return " Raju Redies Method is Called ";
	}

	public String getDataFromDb(Throwable t) {
		System.out.println(" DB  Method Caled");
		return "  getData From DB Redies Method is Called ";
	}
}
