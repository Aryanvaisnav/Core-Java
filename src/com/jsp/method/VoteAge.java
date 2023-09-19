package com.jsp.method;
import java.util.*;

public class VoteAge {
	//Function-1
	public static boolean legalAgeForVote(int age) {
		if(age>=18) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println(legalAgeForVote(age));
		
		// Closing the Scanner
			sc.close();
	}

}
