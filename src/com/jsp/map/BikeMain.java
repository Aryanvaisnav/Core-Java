package com.jsp.map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class BikeMain {

	public static void main(String[] args) {
		Bike B1 = new Bike("Suzuki", 6667);
		Bike B2 = new Bike("BMW", 9857);
		Bike B3 = new Bike("Honda", 8787);
		Bike B4 = new Bike("Mahindra", 7777);
		Bike B5 = new Bike("Tesla", 9825);
		
		
		// LinkedHashMap maintains insertion order 
		
	LinkedHashMap <Bike, String> map = new LinkedHashMap<>();
		map.put(B1,"ABC");
		map.put(B2,"XYZ");
		map.put(B3,"PQR");
		map.put(B4,"LOC");
		map.put(B5,"LTI");
		map.put(B2, "ITC");   // XYZ and ITC has same key. So, XYZ will be updated to ITC.
		
		 System.out.println(map);
		 
		 
		 // TreeMap maintains ascending order
		 TreeMap <Bike, String> TM = new TreeMap<>();
			TM.put(B1,"ABC");
			TM.put(B2,"XYZ");
			TM.put(B3,"PQR");
			TM.put(B4,"LOC");
			TM.put(B5,"LTI");
			
			 System.out.println(TM);
		
	
		
	}

}
