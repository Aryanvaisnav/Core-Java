package com.jsp.loopstatements;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Count of digit: " + count);

		sc.close();
	}
}