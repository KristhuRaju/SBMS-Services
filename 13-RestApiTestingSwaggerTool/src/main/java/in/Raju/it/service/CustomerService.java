package in.Raju.it.service;

import java.util.List;

import in.Raju.it.entity.Customer;

public interface CustomerService {
	
	public String upsert(Customer customer);
	
	public Customer getById(Long cid);
	
	public List< Customer > getAllCustomers();
	
	public String DeleteCustomers(long cid);
	

}
