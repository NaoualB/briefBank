package com.bank.briefBank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BriefBankApplication {

	@Autowired 
	public static void main(String[] args) {
		SpringApplication.run(BriefBankApplication.class, args);
		
		
	}



}
