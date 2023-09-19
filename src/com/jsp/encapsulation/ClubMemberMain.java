package com.jsp.encapsulation;

public class ClubMemberMain {

	public static void main(String[] args) {
		ClubMember C = new ClubMember();
		C.setName("Max");
		System.out.println(C.getName());
		
		C.setAddress("India");
		System.out.println(C.getAddress());
		
		C.setMembershipID(995378);
		System.out.println(C.getMembershipID());

	}

}
