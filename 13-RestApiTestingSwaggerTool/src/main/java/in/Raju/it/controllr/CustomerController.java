package in.Raju.it.controllr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.Raju.it.entity.Customer;
import in.Raju.it.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	 CustomerService customerService;

	@PostMapping("/customer")
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer){
		String status= customerService.upsert(customer);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	} 
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customer> getCustomer(@PathVariable Long cid){
	Customer c= customerService.getById(cid);
	return new  ResponseEntity<Customer>(c,HttpStatus.OK);
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		 List<Customer> allcus= customerService.getAllCustomers();
		 return new ResponseEntity<>(allcus, HttpStatus.OK);
	}
	
	@PutMapping("/customer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer){
		 String status= customerService.upsert(customer);
		 return new ResponseEntity<>(status, HttpStatus.OK);
	}
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Long cid){
	String status= customerService.DeleteCustomers(cid);
	return new ResponseEntity<>(status,HttpStatus.OK);
	}
	
	
}
