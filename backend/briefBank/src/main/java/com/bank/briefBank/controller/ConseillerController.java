package com.bank.briefBank.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.briefBank.model.Conseiller;
import com.bank.briefBank.service.ConseillerService;

@RestController
@CrossOrigin()
@RequestMapping("/api")
public class ConseillerController {
	
	
	@Autowired
	private ConseillerService service; 
	
	@GetMapping("/conseillers")
	public Iterable<Conseiller> getConseillers(){
		return service.getConseillers(); 
	}
}
