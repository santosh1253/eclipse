package com.bank.entity;

import java.sql.Date;

public class Customer {
	private String fullname;
	private int accno;
	private int mbno;
	private String idproof;
	private String address;
	private String email;
	private Date dob;
	private String acctype;
	private double balance;
	private String pwd;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getMbno() {
		return mbno;
	}
	public void setMbno(int mbno) {
		this.mbno = mbno;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Customer()
	{
		
	}
	public Customer(String fullname, int accno, int mbno, String idproof, String address, String email, Date dob,
			String acctype, double balance, String pwd) {
		super();
		this.fullname = fullname;
		this.accno = accno;
		this.mbno = mbno;
		this.idproof = idproof;
		this.address = address;
		this.email = email;
		this.dob = dob;
		this.acctype = acctype;
		this.balance = balance;
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "Customer [fullname=" + fullname + ", accno=" + accno + ", mbno=" + mbno + ", idproof=" + idproof
				+ ", address=" + address + ", email=" + email + ", dob=" + dob + ", acctype=" + acctype + ", balance="
				+ balance + ", pwd=" + pwd + "]";
	}
	

}
