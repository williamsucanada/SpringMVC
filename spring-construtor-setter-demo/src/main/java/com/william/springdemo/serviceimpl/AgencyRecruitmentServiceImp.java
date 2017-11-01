package com.william.springdemo.serviceimpl;

import java.util.Random;

import com.william.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImp implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiring = "\n " + companyName + "'s " +  departmentName + " hired " + random.nextInt(numberOfRecruitments)
				+ " employees" + " using various hiring agencies";
		;

		return hiring;
	}

}
