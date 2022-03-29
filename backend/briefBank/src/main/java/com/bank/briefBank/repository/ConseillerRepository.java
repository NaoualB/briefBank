package com.bank.briefBank.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.briefBank.model.Conseiller;

public interface ConseillerRepository extends JpaRepository<Conseiller, Long> {
}

