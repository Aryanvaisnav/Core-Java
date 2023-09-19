package com.jsp.aggregation;

import java.util.Scanner;

public class MobileController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile details ============================================================================ ");

		System.out.print("Enter the brand: ");
		String brand = sc.next();

		System.out.print("Enter the type: ");
		String type = sc.next();

		System.out.print("Enter the color: ");
		String color = sc.next();

		System.out.print("Enter the price: ");
		double price = sc.nextDouble();

		System.out.println("Enter the Sim1 detials =================================================================================== ");

		System.out.print("Enter the service provider name: ");
		String service_provider_name_1 = sc.next();

		System.out.print("Enter the contact number: ");
		long cno_1 = sc.nextLong();

		System.out.println("Enter the Sim2 detials =================================================================================== ");

		System.out.print("Enter the service provider name: ");
		String service_provider_name_2 = sc.next();

		System.out.print("Enter the contact number: ");
		long cno_2 = sc.nextLong();
		
		
		Mobile mobile = new Mobile(brand, type, color, price, service_provider_name_1, cno_1, service_provider_name_2, cno_2);
		
		// Setting the details
		
		mobile.setBrand(brand);
		mobile.setColor(color);
		mobile.setType(type);
		mobile.setPrice(price);
		mobile.getSim1().setService_provider_name_1(service_provider_name_1);
		mobile.getSim1().setCno_1(cno_1);
		mobile.getSim2().setService_provider_name_2(service_provider_name_2);
		mobile.getSim2().setCno_2(cno_2);
		
		
		// Getting the details
		
		System.out.println("=============================================================================");
		
		System.out.println("Mobile Details: ");
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getType());
		System.out.println(mobile.getColor());
		System.out.println(mobile.getPrice());

		System.out.println("============================================================================");
		
		System.out.println("Sim1 Details: ");
		System.out.println(mobile.getSim1().getService_provider_name_1());
		System.out.println(mobile.getSim1().getCno_1());
		
		System.out.println("============================================================================");
		
		System.out.println("Sim2 Details: ");
		System.out.println(mobile.getSim2().getService_provider_name_2());
		System.out.println(mobile.getSim2().getCno_2());
		
		System.out.println("=============================================================================");
		
		sc.close();
		
			
		
	}

}
