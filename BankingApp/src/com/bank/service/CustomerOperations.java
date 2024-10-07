package com.bank.service;

import com.bank.entity.Customer;

public interface CustomerOperations {
	public String saveCustomer(Customer c);

	public void updateCustomer(Customer c, long accno);
	public void fetchAllCustomers();

	public void deleteCustomer(long accno);

	public boolean fetchCustomer(long accno);
}
