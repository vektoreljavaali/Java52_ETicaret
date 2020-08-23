package com.vektorel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblkategori {

	@Id
	@SequenceGenerator(name = "sq_kategori_id",sequenceName = "sq_kategori_id",
						initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "sq_kategori_id")
	private int id;
	private String ad;
	private String resimurl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	
	
}
