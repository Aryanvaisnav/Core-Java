package com.jsp.array;

public class LinearSearch {
	
	public static void linearSearchMethod(int key, int arr[]) {
		for(int index = 0; index<= arr.length-1; index++)
		{
			if(arr[index]==key)
			{
				System.out.println("Element is present");
				return; // return will take us out of the method block
			}
			
		}
		
		System.out.println("Element is absent");
		
		
	}

	public static void main(String[] args) {
		int arr [] = {10, 20, 30, 40, 50, 60} ;
		int key = 30;
		linearSearchMethod(key, arr);

	}

}
