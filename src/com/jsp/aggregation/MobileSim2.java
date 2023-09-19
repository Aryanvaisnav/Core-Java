package com.jsp.aggregation;

public class MobileSim2 {

	private String service_provider_name_2;
	private long cno_2;

	
	// Service Provider Name
	
	public String getService_provider_name_2() {
		return service_provider_name_2;
	}

	public void setService_provider_name_2(String service_provider_name_2) {
		this.service_provider_name_2 = service_provider_name_2;
	}

	// Contact Number
	
	public long getCno_2() {
		return cno_2;
	}

	public void setCno_2(long cno_2) {
		this.cno_2 = cno_2;
	}
	
	public MobileSim2(String service_provider_name_2, long cno_2) {
		this.service_provider_name_2 = service_provider_name_2;
		this.cno_2 = cno_2;
	}

}
