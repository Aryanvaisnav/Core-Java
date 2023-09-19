package com.jsp.map;

public class Bike implements Comparable<Bike>{
	String brand;
	int modelNo;
	
	public Bike(String brand, int modelNo) {
		this.brand = brand;
		this.modelNo = modelNo;
	}
	
	// toString method Override
	
	@Override
	public String toString() {
		return "[Brand: "+brand+", ModelNumber:"+modelNo+"]";
	}
	
	// equals method Override
	
	@Override
	public boolean equals(Object O) {
		Bike B = (Bike) O;
		return this.modelNo == B.modelNo;
	}
	
	// hashCode method Override
	
	@Override
	public int hashCode() {
		return modelNo;
	}

	@Override
	public int compareTo(Bike obj) {
		return this.modelNo - obj.modelNo;
	}
	
	
	
	

}
