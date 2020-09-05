package com.vektorel.modelview;

import java.util.List;

import com.vektorel.model.tblkategori;
import com.vektorel.model.tblpages;
import com.vektorel.model.tblurun;

public class ModelWebSiteIndex {

	private List<tblkategori> listeKategori;
	private List<tblurun> listeUrun;
	
	
	public List<tblurun> getListeUrun() {
		return listeUrun;
	}

	public void setListeUrun(List<tblurun> listeUrun) {
		this.listeUrun = listeUrun;
	}

	public List<tblkategori> getListeKategori() {
		return listeKategori;
	}

	public void setListeKategori(List<tblkategori> listeKategori) {
		this.listeKategori = listeKategori;
	}
	
	
	
	
}
