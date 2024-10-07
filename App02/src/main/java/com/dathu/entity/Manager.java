package com.dathu.entity;

import java.util.List;

public class Manager {
	private int managerId;
	private String name;
	private String role;
	private List<Employee> employees;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", role=" + role + ", employees=" + employees + "]";
	}

}
