package com.jsp.decisionmakingstatement;

import java.util.Scanner;

public class CheckTheNatureOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = '+';

		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is an alphabet");

		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a number");

		} else {
			System.out.println(ch + " is a special character");
		}
		
		sc.close();

	}

}
