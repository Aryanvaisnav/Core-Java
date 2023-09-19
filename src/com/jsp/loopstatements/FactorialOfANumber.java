package com.jsp.loopstatements;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();

		int z = n;
		int x = n;

		// while loop

		int pro = 1;
		while (z > 0) {
			pro = pro * z;
			z--;
		}
		System.out.println(pro);

		// ===================================================================================

		// for loop

		pro = 1;
		for (int i = 1; i <= n; i++) {
			pro = pro * i;
		}
		System.out.println(pro);

		// ===================================================================================

		// do-while loop

		pro = 1;
		do {
			pro = pro * x;
			x--;
		} while (x > 0);
		System.out.println(pro);

		sc.close();
	}

}
