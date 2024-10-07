package mydemo.hb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	private int regno;
	private String address;
	private String cname;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public Company()
	{
		
	}
	@Override
	public String toString() {
		return "Company [regno=" + regno + ", address=" + address + ", cname=" + cname + "]";
	}
	
	

}
