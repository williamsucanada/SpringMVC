package com.william.springdemo.serviceimpl;

import java.util.Random;

import com.william.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {

		Random random = new Random();
		String service = "\nAs an organization, " + companyName + " offer world class cloud computing infrastructure."
				+ "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars";
		;

		return service;
	}

}
