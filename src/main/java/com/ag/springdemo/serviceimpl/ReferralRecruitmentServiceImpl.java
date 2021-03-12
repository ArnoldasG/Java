package com.ag.springdemo.serviceimpl;

import com.ag.springdemo.service.RecruitmentService;

import java.util.Random;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

    @Override
    public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
        Random random = new Random();
        String hiringFacts = "\n " + companyName + "'s " + departmentName + " hired " +
                random.nextInt(numberOfRecruitments) + " employees " +
                "which were referred to the company employees.";
        return hiringFacts;
    }
}
