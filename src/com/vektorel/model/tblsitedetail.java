package com.vektorel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class tblsitedetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String adres;
	String telefon;
	String email;
	String facebook;
	String instagram;
	String twitter;
	String firmaadi;
	String firmalink;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getFirmaadi() {
		return firmaadi;
	}
	public void setFirmaadi(String firmaadi) {
		this.firmaadi = firmaadi;
	}
	public String getFirmalink() {
		return firmalink;
	}
	public void setFirmalink(String firmalink) {
		this.firmalink = firmalink;
	}
	
	
	
}
