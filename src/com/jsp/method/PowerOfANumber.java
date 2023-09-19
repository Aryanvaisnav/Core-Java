package com.jsp.method;
import java.util.*;
public class PowerOfANumber {
	//Function-1
	public static double powerOfNumber(int x, int n) {
		return Math.pow(x,n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(powerOfNumber(x,n));
		
		// Closing the Scanner
			sc.close();

	}

}
