package com.jsp.aggregation;

public class MobileSim1 {

	private String service_provider_name_1;
	private long cno_1;

	
	// Service Provider Name
	
	public String getService_provider_name_1() {
		return service_provider_name_1;
	}

	public void setService_provider_name_1(String service_provider_name_1) {
		this.service_provider_name_1 = service_provider_name_1;
	}

	// Contact Number
	
	public long getCno_1() {
		return cno_1;
	}

	public void setCno_1(long cno_1) {
		this.cno_1 = cno_1;
	}
	
	
	public MobileSim1(String service_provider_name_1, long cno_1) {
		this.service_provider_name_1 = service_provider_name_1;
		this.cno_1 = cno_1;
		
	}

}
