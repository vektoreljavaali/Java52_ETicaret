package com.vektorel.modelview;

import java.util.List;

import com.vektorel.model.tblkategori;
import com.vektorel.model.tblpages;

public class ModelWebSiteIndex {

	private List<tblkategori> listKategori;
	private List<tblpages> listPages;
	
	

	public List<tblpages> getListPages() {
		return listPages;
	}

	public void setListPages(List<tblpages> listPages) {
		this.listPages = listPages;
	}

	public List<tblkategori> getListKategori() {
		return listKategori;
	}

	public void setListKategori(List<tblkategori> listKategori) {
		this.listKategori = listKategori;
	}
	
	
}
