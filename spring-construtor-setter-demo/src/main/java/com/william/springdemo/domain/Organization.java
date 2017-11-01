package com.william.springdemo.domain;

import com.william.springdemo.service.BusinessService;

public class Organization {

	private String companyName;
	private int yearOfIncorporation;

	private String postalCode;
	private int employeeCount;

	private String slogan;
	private BusinessService businessService;

	/*
	 * public Organization(){
	 * 
	 * }
	 */

	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String cororateSlogan() {

		return slogan;

	}

	public String corporateService() {

		return businessService.offerService(companyName);
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}

}
