package mydemo.hb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile_numbs")
public class Mobile {
	@Id
	private long number;
	private String numberType;
	private String provider;
	public  long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getNumberType() {
		return numberType;
	}
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [number=" + number + ", numberType=" + numberType + ", provider=" + provider + "]";
	}
	
}
