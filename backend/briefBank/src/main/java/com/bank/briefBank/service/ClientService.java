package com.bank.briefBank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.briefBank.model.Client;
import com.bank.briefBank.model.Conseiller;
import com.bank.briefBank.repository.ClientRepository;

import lombok.Data;

@Data
@Service

public class ClientService {

	@Autowired
	private ClientRepository clientRepo; 
	
    public Iterable<Client> getClientFromIdConseiller(Long id) {
        return clientRepo.findAll();
    }
}
