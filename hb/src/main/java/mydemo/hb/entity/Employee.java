package mydemo.hb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int empId;
	private String empname;
	@ManyToOne(targetEntity=Company.class,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="regno")
	private Company company;
	public Employee()
	{
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", company=" + company + "]";
	}
	public void setEmpname(String empname) {
		this.empname=empname;		
	}
	
	

}
