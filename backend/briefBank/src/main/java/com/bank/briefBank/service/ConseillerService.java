package com.bank.briefBank.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.briefBank.model.Conseiller;
import com.bank.briefBank.repository.ConseillerRepository;

import lombok.Data;

@Data
@Service

public class ConseillerService {
	
    @Autowired
    private ConseillerRepository conseillerRepository;

    
    public Iterable<Conseiller> getConseillers() {
        return conseillerRepository.findAll();
    }

}
