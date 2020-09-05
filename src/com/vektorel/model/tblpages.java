package com.vektorel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblpages {

	// 1- Ana Menü
	//   1.1 alt menü-1
	//   1.2 alt menü-2
	
	@Id
	@SequenceGenerator(name = "sq_tblpages_id",
					sequenceName = "sq_tblpages_id",
					allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "sq_tblpages_id")
	private int id;
	private String ad;
	private int parentid;
	private String url;
	
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
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
