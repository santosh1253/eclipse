package com.files;

public class Mobile {
	private int imei;
	private String modelname;
	private int price;
    private Sim sim;
	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}



	@Override
	public String toString() {
		return "Mobile [imei=" + imei + ", modelname=" + modelname + ", price=" + price + ", sim=" + sim + "]";
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.setImei(987654);
		m.setModelname("Vivo");
		m.setPrice(20000);
		Sim s=new JioSim();
		Sim s1=new AirtelSim();
		m.setSim(s1);
		s.getSimName();
		System.out.println(s);
		System.out.println(m);

	}
}
