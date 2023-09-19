package com.jsp.array;

public class Exercise1 {
	
	public static void exerciseMethod(char key, char arr[]) {
		for(int index = 0; index<=arr.length-1; index++)
		{
			if(arr[index]==key)
			{
				System.out.println("Element is present");
				return;
			}
		}
		
		System.out.println("Element is absent");
		
	}

	public static void main(String[] args) {
		char arr [ ] = {'a', 'b', 'c', 'd', 'e', 'f' } ;
		char key = 'e';
		exerciseMethod(key, arr);

	}

}
