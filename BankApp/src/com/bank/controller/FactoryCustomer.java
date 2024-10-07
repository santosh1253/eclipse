package com.bank.controller;

public class FactoryCustomer {
	private static AdminController ref;
	public static AdminController getCustomer()
	{
		ref=new AdminControllerImpl();
		return ref;
	}
}
