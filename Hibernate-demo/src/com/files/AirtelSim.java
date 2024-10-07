package com.files;

public class AirtelSim implements Sim{
	private String networkName="Airtel";
	private String strength="4g";
	public String getNetworkName() {
		return networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public AirtelSim(String networkName, String strength) {
		super();
		this.networkName = networkName;
		this.strength = strength;
	}
	public AirtelSim() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AirtelSim [networkName=" + networkName + ", strength=" + strength + "]";
	}
	@Override
	public void getSimName() {
	System.out.println("From Airtel Sim");		
	}
	

}
