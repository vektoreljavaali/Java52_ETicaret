package com.vektorel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblurun {

	@Id
	@SequenceGenerator(name = "sq_tblurun_id",sequenceName = "sq_tblurun_id",
					allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "sq_tblurun_id")
	private long id;
	private String ad;
	private double fiyat;
	private double stok;
	@Column(length = 5000)
	private String aciklama;
	private int kategoriid;
	private String kargosuresi;
	private double agirlik;
	private int ortalamapuan;
	private String anaresim;
	
	public String getAnaresim() {
		return anaresim;
	}
	public void setAnaresim(String anaresim) {
		this.anaresim = anaresim;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getStok() {
		return stok;
	}
	public void setStok(double stok) {
		this.stok = stok;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getKategoriid() {
		return kategoriid;
	}
	public void setKategoriid(int kategoriid) {
		this.kategoriid = kategoriid;
	}
	public String getKargosuresi() {
		return kargosuresi;
	}
	public void setKargosuresi(String kargosuresi) {
		this.kargosuresi = kargosuresi;
	}
	public double getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(double agirlik) {
		this.agirlik = agirlik;
	}
	public int getOrtalamapuan() {
		return ortalamapuan;
	}
	public void setOrtalamapuan(int ortalamapuan) {
		this.ortalamapuan = ortalamapuan;
	}
	
	
}
