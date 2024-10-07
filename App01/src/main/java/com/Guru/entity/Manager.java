package com.Guru.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerId;
	
	private String name;
	private float salary;
	
	@OneToOne(targetEntity = Employee.class,cascade = CascadeType.ALL)
	private Employee employee;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int managerId, String name, float salary) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", salary=" + salary + ", employee=" + employee
				+ "]";
	}

}
