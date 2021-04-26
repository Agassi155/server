package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String nom;
private String sexe;
private String situation;
private String etat;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public String getSituation() {
	return situation;
}
public void setSituation(String situation) {
	this.situation = situation;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public Client(int id, String nom, String sexe, String situation, String etat) {
	super();
	this.id = id;
	this.nom = nom;
	this.sexe = sexe;
	this.situation = situation;
	this.etat = etat;
}
public Client() {
	super();
	// TODO Auto-generated constructor stub
}





	
}
