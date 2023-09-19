package com.jsp.aggregation;

public class Mobile {

	private String brand;
	private String type;
	private String color;
	private double price;

	private MobileSim1 sim1; // Aggregation

	private MobileSim2 sim2; // Aggregation

	// Brand

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// Type

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Color

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Price

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Sim1

	public MobileSim1 getSim1() {
		return sim1;
	}

	public void setSim1(MobileSim1 sim1) {
		this.sim1 = sim1;
	}

	// Sim2

	public MobileSim2 getSim2() {
		return sim2;
	}

	public void setSim2(MobileSim2 sim2) {
		this.sim2 = sim2;
	}

	public Mobile(String brand, String type, String color, double price, String service_provider_name_1, long cno_1,
			String service_provider_name_2, long cno_2) {
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
		this.sim1 = new MobileSim1(service_provider_name_1, cno_1);
		this.sim2 = new MobileSim2(service_provider_name_2, cno_2);

	}

}
