package com.bank.entity;

import java.sql.Date;

public class Customer {
	private String name;
	private long accno;
	private String acctype;
	private double balance;
	private Date dob;
	private String address;
	private long mbno;
	private String email;
	private String idproof;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(String name, long accno, String acctype, double balance, Date dob, String address, long mbno,
			String email, String idproof, String password) {
		super();
		this.name = name;
		this.accno = accno;
		this.acctype = acctype;
		this.balance = balance;
		this.dob = dob;
		this.address = address;
		this.mbno = mbno;
		this.email = email;
		this.idproof = idproof;
		this.password = password;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", accno=" + accno + ", acctype=" + acctype + ", balance=" + balance
				+ ", dob=" + dob + ", address=" + address + ", mbno=" + mbno + ", email=" + email + ", idproof="
				+ idproof + ", password=" + password + "]";
	}
	
	

}
