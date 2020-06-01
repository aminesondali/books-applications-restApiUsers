package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;





@Entity
public class User implements Serializable{
	@Id 
	@GeneratedValue
	private long id;
	
	private String nom;
	private String Prenom;
	private String password;
	@Column(unique  = true)
	private String email;
	private String photoProfil;
	private String role;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	// Getters AND Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhotoProfil() {
		return photoProfil;
	}
	public void setPhotoProfil(String photoProfil) {
		this.photoProfil = photoProfil;
	}
	
	// Constructor with Parameters
	public User(String nom, String prenom, String password, String email, String photoProfil) {
		super();
		this.nom = nom;
		Prenom = prenom;
		this.password = password;
		this.email = email;
		this.photoProfil = photoProfil;
		this.role = role;
	}
	
	// Constructor without Parameters
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
