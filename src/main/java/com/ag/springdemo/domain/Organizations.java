package com.ag.springdemo.domain;

import com.ag.springdemo.service.BusinessService;

public class Organizations {
	
	// FIELDS

	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan; // šūkis
	private BusinessService businessService;

	// CONSTRUCTOR

	public Organizations(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	// SETTERS

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;

	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String getCompanyName() {
		return companyName;
	}

	// METHODS

	public String corporateSlogan() {
		return slogan;
	}

	// This method access the business service and executes the offer service method after the injection of the
	// desired service implementation.
	public String corporateService() {
		return businessService.offerService(companyName);
	}

	@Override
	public String toString() {
		return "Organizations [companyName= " + companyName + ", yearOfIncorporation= " + yearOfIncorporation
				+ ", postalCode= " + postalCode + ", employeeCount= " + employeeCount + "]";
	}

}
