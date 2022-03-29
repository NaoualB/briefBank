package com.bank.briefBank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 

	private String name; 
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="raison_sociale")
	private String raisonSociale; 
	
	private String numclient; 
	
	@ManyToOne @JoinColumn(name= "idConseiller")
	private Conseiller conseiller; 
	
}
