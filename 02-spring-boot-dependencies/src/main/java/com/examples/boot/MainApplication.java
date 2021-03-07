package com.examples.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.boot.service.impl.accounts.DatabaseAccountService;

@SpringBootApplication
@ComponentScan 
@RestController
public class MainApplication {

	@Autowired
	DatabaseAccountService databaseAccountService;
	
    @RequestMapping("/")
    String home() {
        return databaseAccountService.callMe();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
