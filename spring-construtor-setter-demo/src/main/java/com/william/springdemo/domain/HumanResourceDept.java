package com.william.springdemo.domain;

import com.william.springdemo.service.RecruitmentService;

public class HumanResourceDept implements Department {

	private String deptName;
	private RecruitmentService recuritmentService;
	private Organization organizaiton;

	public HumanResourceDept(RecruitmentService recuritmentService, Organization organizaiton) {
		this.recuritmentService = recuritmentService;
		this.organizaiton = organizaiton;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numberOfRecruitments) {

		String hiringFacts = recuritmentService.recruitEmployees(organizaiton.getCompanyName(), deptName,
				numberOfRecruitments);

		return hiringFacts;
	}

}
