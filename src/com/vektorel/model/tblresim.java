package com.vektorel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblresim {

	@Id
	@SequenceGenerator(name = "sq_tblresim_id",
	sequenceName = "sq_tblresim_id",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "sq_tblresim_id")
	private long id;
	private long urunid;
	private String resimurl;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUrunid() {
		return urunid;
	}
	public void setUrunid(long urunid) {
		this.urunid = urunid;
	}
	public String getResimurl() {
		return resimurl;
	}
	public void setResimurl(String resimurl) {
		this.resimurl = resimurl;
	}
	
	
}
