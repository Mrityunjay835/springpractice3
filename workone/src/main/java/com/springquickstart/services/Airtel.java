package com.springquickstart.services;
;

public class Airtel {
	
	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activeService() {
		service.service();
	}

}
