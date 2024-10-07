package com.bank.service;

public class CustomerFactory {
	private static CustomerOperations ref;
	public static  CustomerOperations getImpl()
	{
		ref=new CustomerOperationsImpl();
		return ref;
	}

}
