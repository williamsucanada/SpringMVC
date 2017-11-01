package com.william.springdemo.serviceimpl;

import java.util.Random;

import com.william.springdemo.service.RecruitmentService;

public class ReferralRecuritmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringfacts = "\n " + companyName + "'s " + departmentName + "hired "
				+ random.nextInt(numberOfRecruitments) + " employees"
				+ "  which were referred to the company by employess";
		;

		return hiringfacts;
	}

}
