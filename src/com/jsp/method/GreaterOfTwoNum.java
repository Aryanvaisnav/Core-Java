package com.jsp.method;
import java.util.*;

public class GreaterOfTwoNum {
	
	public static int greaterOfTwoNumber(int a, int b) {
		int c = a>b ? a : b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Greater Number is "+ greaterOfTwoNumber(a,b));
		
		// Closing the Scanner
				sc.close();
	}
	

}
