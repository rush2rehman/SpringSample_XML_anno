package com.mycompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.model.customer;
import com.mycompany.repository.CustomerRepo;
import com.mycompany.repository.HibernateCustomerRepoImpl;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	/* (non-Javadoc)
	 * @see com.mycompany.service.CustomerService#findAll()
	 */
	
	private CustomerRepo customerRepo;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepo customerRepo) {
		System.out.println("We are inside construcyor auto wired");
		this.customerRepo = customerRepo;
	}
	
	@Autowired
		public void setCustomerRepo(CustomerRepo customerRepo) {
		System.out.println("We are inside setter auto wired");
		
		this.customerRepo = customerRepo;
	}

	@Override
	public List<customer> findAll()
	{
		return new HibernateCustomerRepoImpl().findAll();
	}

}
