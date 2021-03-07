package com.examples.boot.service.impl;

import org.springframework.stereotype.Service;

import com.examples.boot.service.MyService;

@Service
public class RiskAssessor implements MyService {

	@Override
	public String callMe() {
	   return "RiskAssessor callMe()";
	}
	
}
