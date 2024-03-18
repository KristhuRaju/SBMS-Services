package in.Raju.it.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.Raju.it.entity.Customer;
import in.Raju.it.repository.CustomerRepository;
@Service
public class MyUserDetailsService implements UserDetailsService{

	private CustomerRepository customerRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Customer c=	customerRepository.findByUname(username);
		return new User(c.getUname(),c.getPwd(), Collections.emptyList());
	}

}
