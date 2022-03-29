package com.bank.briefBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.briefBank.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
