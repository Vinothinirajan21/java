package com.tns.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class CustomerServicesController {
	@Autowired
private CustomerServices a;
	
	@GetMapping(("/CustomerServices"))
	public List<Customer> list()
	{
		return a.listAll();
	}
	@GetMapping("/CustomerServices/(Customer_id)")
	public ResponseEntity<Customer> get (@PathVariable Integer Customer_id)
	{
		try
		{
			Customer Customer=a.get(Customer_id);
			return new ResponseEntity<Customer>(Customer,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/CustomerServices")
	public void add(@RequestBody Customer cus)
	{
		a.save(cus);
	}
	@PutMapping("/CustomerServices/(ad_id)")
	public ResponseEntity<?> update(@RequestBody Customer cus,@PathVariable Integer Customer_id)
	{ 
		Customer existCustomer=a.get(Customer_id);
		a.save(cus);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/CustomerServices/(Customer_id)")
	public void delete (@PathVariable Integer Customer_id)
	{
		a.delete(Customer_id);
	}

}
