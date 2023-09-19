package com.jsp.method;
import java.util.*;

public class Average {
	
	//Function-1
	public static int avgOfNumbers(int a, int b, int c) {
		return (a+b+c)/3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Average of three numbers: "+ avgOfNumbers(a,b,c)); //function calling statement	
		
		// Closing the Scanner
				sc.close();
	}
	
}

