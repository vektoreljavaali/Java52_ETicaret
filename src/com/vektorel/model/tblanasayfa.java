package com.vektorel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class tblanasayfa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String kampanya_1_url;
	String kampanya_2_url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKampanya_1_url() {
		return kampanya_1_url;
	}
	public void setKampanya_1_url(String kampanya_1_url) {
		this.kampanya_1_url = kampanya_1_url;
	}
	public String getKampanya_2_url() {
		return kampanya_2_url;
	}
	public void setKampanya_2_url(String kampanya_2_url) {
		this.kampanya_2_url = kampanya_2_url;
	}
	
	
}
