package com.tns.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CustomerServices {
	@Autowired
	private CustomerServicesRepository repo;
	public List <Customer>listAll()
	{
		return repo.findAll();
	}
	public Customer get(Integer Customer_id)
	{
		return repo.findById(Customer_id).get();
	}
	public void delete(Integer Customer_id)
	{
		repo.deleteById(Customer_id);
	}
	public void save(Customer cus)
	{
		repo.save(cus);
	}

}
