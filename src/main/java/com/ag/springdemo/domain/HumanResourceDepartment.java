package com.ag.springdemo.domain;

import com.ag.springdemo.service.RecruitmentService;

public class HumanResourceDepartment implements Department {

    private String deptName;
    private RecruitmentService recruitmentService;
    private Organizations organizations;


    public HumanResourceDepartment(RecruitmentService recruitmentService, Organizations organizations) {
        this.recruitmentService = recruitmentService;
        this.organizations = organizations;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String hiringStatus(int numberOfRecruitments) {
        String hiringFacts = recruitmentService.recruitEmployees(organizations.getCompanyName(),
                deptName, numberOfRecruitments);
        return hiringFacts;
    }
}
