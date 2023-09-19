package com.jsp.encapsulation;

public class ClubMember {
	
	// Exercise
	
	private String name;
	private String address;
	private int membershipID;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setMembershipID(int membershipID) {
		this.membershipID = membershipID;	
	}
	
	public int getMembershipID() {
		return membershipID;
	}

}
