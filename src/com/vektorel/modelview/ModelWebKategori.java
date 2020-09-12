package com.vektorel.modelview;

import java.util.List;

import com.vektorel.model.tblkategori;
import com.vektorel.model.tblurun;

public class ModelWebKategori {

	private List<tblkategori> kategoriListesi;
	private List<tblurun> urunListesi;
	
	
	public List<tblurun> getUrunListesi() {
		return urunListesi;
	}

	public void setUrunListesi(List<tblurun> urunListesi) {
		this.urunListesi = urunListesi;
	}

	public List<tblkategori> getKategoriListesi() {
		return kategoriListesi;
	}

	public void setKategoriListesi(List<tblkategori> kategoriListesi) {
		this.kategoriListesi = kategoriListesi;
	}
	
	
}
