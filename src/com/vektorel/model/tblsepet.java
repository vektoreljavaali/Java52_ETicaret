package com.vektorel.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class tblsepet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long urunid;
	private String resimurl;
	private String urunadi;
	private double fiyat;
	private double toplamfiyat;
	private long userid;
	private int adet;
	private int durum; // 0-> eklenmiþ // 1-> satýnalýnmýþ // 2-> daha sonra satýn al // 3. silinmiþ v.s.
	
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
	public String getUrunadi() {
		return urunadi;
	}
	public void setUrunadi(String urunadi) {
		this.urunadi = urunadi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getToplamfiyat() {
		return toplamfiyat;
	}
	public void setToplamfiyat(double toplamfiyat) {
		this.toplamfiyat = toplamfiyat;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public int getDurum() {
		return durum;
	}
	public void setDurum(int durum) {
		this.durum = durum;
	}
	
	
}
