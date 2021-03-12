package com.ag.springdemo.serviceimpl;

import java.util.Random;

import com.ag.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	@Override
	public String offerService(String companyName) {
		// Creating a new instance of Random class and this class comes as a part of Java.
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				"offers world class Cloud computing infrastructuee." +
				"\n annual income exceeds " + random.nextInt(revenue) + "dollars";
		return service;
	}

}
