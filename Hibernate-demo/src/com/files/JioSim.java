package com.files;

public class JioSim implements Sim{

	private String networkName="Jio";
	private String strength="5g signal";
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
	public JioSim()
	{
		
	}
	@Override
	public String toString() {
		return "JioSim [networkName=" + networkName + ", strength=" + strength + "]";
	}
	@Override
	public void getSimName() {
		System.out.println("From JIO SIM");
		
	}
	
}
