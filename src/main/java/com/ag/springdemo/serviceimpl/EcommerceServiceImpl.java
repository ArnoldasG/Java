package com.ag.springdemo.serviceimpl;

import java.util.Random;

import com.ag.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	@Override
	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\n As an Organization, " + companyName + 
				" provides an outstanding Ecommerce platform. " +
				"\nThe annual revenue exceeds " + random.nextInt(revenue) + "dollars";
		return service;
		
	}

}
