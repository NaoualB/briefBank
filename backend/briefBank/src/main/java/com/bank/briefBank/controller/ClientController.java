package com.bank.briefBank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.briefBank.model.Client;
import com.bank.briefBank.model.Conseiller;
import com.bank.briefBank.service.ClientService;
import com.bank.briefBank.service.ConseillerService;

@RestController
@CrossOrigin()
@RequestMapping("/api")
public class ClientController {


	public class ConseillerController {
		

		@Autowired
		private ClientService service; 
		
//		@GetMapping("/client/{id}")
//		public Iterable<Client> read(@RequestParam Long id, Conseiller conseiller) Iterable<Client> getClientFromIdConseiller(){
//			return service.getClientFromIdConseiller(null);
//		}
	}
}
