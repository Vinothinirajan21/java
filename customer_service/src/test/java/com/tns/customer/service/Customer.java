package com.tns.customer.service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	private Integer Customer_Id;
	private String Customer_Name;
	private Integer Customer_Phn_Num;
	private String Customer_Email;
	private Integer Customer_ZipCode;
	private String Customer_Feedback;
	public Customer()
	{
		super();

	}
	public Customer(Integer customer_Id, String customer_Name, Integer customer_Phn_Num, String customer_Email,
			Integer customer_ZipCode, String customer_Feedback) {
		super();
		Customer_Id = customer_Id;
		Customer_Name = customer_Name;
		Customer_Phn_Num = customer_Phn_Num;
		Customer_Email = customer_Email;
		Customer_ZipCode = customer_ZipCode;
		Customer_Feedback = customer_Feedback;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(Integer customer_Id) {
		Customer_Id = customer_Id;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public Integer getCustomer_Phn_Num() {
		return Customer_Phn_Num;
	}
	public void setCustomer_Phn_Num(Integer customer_Phn_Num) {
		Customer_Phn_Num = customer_Phn_Num;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getCustomer_Email() {
		return Customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		Customer_Email = customer_Email;
	}
	public Integer getCustomer_ZipCode() {
		return Customer_ZipCode;
	}
	public void setCustomer_ZipCode(Integer customer_ZipCode) {
		Customer_ZipCode = customer_ZipCode;
	}
	public String getCustomer_Feedback() {
		return Customer_Feedback;
	}
	public void setCustomer_Feedback(String customer_Feedback) {
		Customer_Feedback = customer_Feedback;
	}
	public String toString()
	{
		return "Customer Id:"+Customer_Id+"Customer Name:"+Customer_Name+" customer phoneNumber:"+"customer_Phn_Num"+"Customer Email:"+"Customer_Email"+"Customer Zipcode:"+"Customer_ZipCode"+"Customer feedback:"+"Customer_feedback";
	}
	
}