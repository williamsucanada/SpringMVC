package com.william.springdemo.serviceimpl;

import java.util.Random;

import com.william.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organization, " + companyName + " provids an outstanding Ecommerce platform."
				+ "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars";
		;
		return service;
	}

}
