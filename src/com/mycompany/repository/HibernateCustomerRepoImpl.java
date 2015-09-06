package com.mycompany.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.model.customer;

@Repository("customerRepo")
public class HibernateCustomerRepoImpl implements CustomerRepo  {
	
	/* (non-Javadoc)
	 * @see com.mycompany.repository.CustomerRepo#findAll()
	 */
	@Override
	public List<customer> findAll()
	{
		List<customer> customers = new ArrayList<customer>();
		customer c = new customer();
		c.setFirstName("Kalilur Rahman");
		c.setLastName("Habibullah");
		customers.add(c);
		return customers;
	}

}
