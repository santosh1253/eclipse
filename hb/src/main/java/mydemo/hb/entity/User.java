package mydemo.hb.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_rec")
public class User {
	@Id
	private int userId;
	private String fullName;
	private String address;
	//Building OneToMany association
	@OneToMany(targetEntity=Mobile.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",referencedColumnName="userId")
	private Set<Mobile> mobiles;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fullName=" + fullName + ", address=" + address + ", mobiles=" + mobiles
				+ "]";
	}
	

}
