package com.jsp.array;
import java.util.*;
public class UserDefinedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [6];
		
		System.out.println("Enter the array elements");
		
		// Taking input from the user
		for(int index = 0; index<=arr.length-1; index++)
		{
			arr[index] = sc.nextInt();
		}
		
		System.out.println("Required array is");
		
		// For printing the array
		
		for(int i = 0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		// Closing the Scanner sc 
			sc.close();

	}

}