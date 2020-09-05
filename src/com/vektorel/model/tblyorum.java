package com.vektorel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblyorum {

	@Id
	@SequenceGenerator(name = "sq_tblyorum_id",sequenceName = "sq_tblyorum_id",
					allocationSize = 1, initialValue = 1)	
	@GeneratedValue(generator = "sq_tblyorum_id")
	private long id;
	private long urunid;
	private long userid;
	private String yorumbasligi;
	private String yorumicerigi;
	private int puan;
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
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getYorumbasligi() {
		return yorumbasligi;
	}
	public void setYorumbasligi(String yorumbasligi) {
		this.yorumbasligi = yorumbasligi;
	}
	public String getYorumicerigi() {
		return yorumicerigi;
	}
	public void setYorumicerigi(String yorumicerigi) {
		this.yorumicerigi = yorumicerigi;
	}
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	
	
	
}
