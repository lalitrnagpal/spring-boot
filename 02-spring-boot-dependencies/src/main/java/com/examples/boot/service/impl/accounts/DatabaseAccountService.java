package com.examples.boot.service.impl.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.boot.service.MyService;
import com.examples.boot.service.impl.RiskAssessor;

@Service
public class DatabaseAccountService implements MyService {

   private final RiskAssessor riskAssessor;

   @Autowired
   public DatabaseAccountService(RiskAssessor riskAssessor) {
      this.riskAssessor = riskAssessor;
   }
   
   @Override
   public String callMe() {
	   return "DatabaseAccountService callMe(), " + riskAssessor.callMe();
   }

}

