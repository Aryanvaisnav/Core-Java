package com.jsp.loopstatements;

import java.util.Scanner;

public class NaturalNumbersWithinRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value: ");
		int a = sc.nextInt();
		System.out.print("Enter the last value: ");
		int b = sc.nextInt();

		if (a >= 0 && b > 0 && b > a) {

			System.out.println("Natural Numbers between " + a + " and " + b + " are : ");

			for (int i = a; i <= b; i++) {
				if (i > 0) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("Invalid Range");
		}
		sc.close();
	}
}
