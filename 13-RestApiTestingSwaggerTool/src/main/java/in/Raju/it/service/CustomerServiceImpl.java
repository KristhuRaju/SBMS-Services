package in.Raju.it.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Raju.it.entity.Customer;
import in.Raju.it.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  implements CustomerService {

	@Autowired
	 CustomerRepository customerRepository;
	
	@Override
	public String upsert(Customer customer) {
		customerRepository.save(customer);
		return "Success";
	}

	@Override
	public Customer getById(Long cid) {
		Optional<Customer> Byid=customerRepository.findById(cid);
		
		if(Byid.isPresent()) {
			System.out.println("Customer id & details "+Byid.get());
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

	@Override
	public String DeleteCustomers(long cid) {
		if(customerRepository.existsById(cid)) {
			customerRepository.deleteById(cid);
			return "Customer deleted ";
		}else 
		return "No recordes found ";
	}

}
