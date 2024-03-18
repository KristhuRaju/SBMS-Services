package in.Raju.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Raju.it.entity.Customer;
import in.Raju.it.repository.CustomerRepository;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/register")
	public String registorCustomer(@RequestBody Customer customer) {
		String encodedPwd = passwordEncoder.encode(customer.getPwd());
		customer.setPwd(encodedPwd);
		customerRepository.save(customer);
		return "Welcome to Java Spring Security Registor & Login concept";
	}

	@PostMapping("/login")
	public ResponseEntity <String>loginCheck(@RequestBody Customer c) {

		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(c.getUname(), c.getPwd());
		try {
			Authentication authenticate = authenticationManager.authenticate(token);
			if (authenticate.isAuthenticated()) {
				return new ResponseEntity<>("Welcome to Login security",HttpStatus.OK) ;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return new ResponseEntity<String>("Bad req", HttpStatus.BAD_REQUEST);

	}

}
