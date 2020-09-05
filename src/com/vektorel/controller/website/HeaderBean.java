package com.vektorel.controller.website;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.vektorel.dao.website.KategoriDao;
import com.vektorel.dao.website.PagesDao;
import com.vektorel.model.tblkategori;
import com.vektorel.model.tblpages;

@ManagedBean(name = "headerBean")
public class HeaderBean {
	
	private List<tblkategori> kategoriListesi;
	private List<tblpages> sayfaListesi;
	private KategoriDao dbKategori;
	private PagesDao dbPages;
	
	public HeaderBean() {
		dbKategori = new KategoriDao();
		dbPages = new PagesDao();
	}
	
	public List<tblkategori> getKategoriListesi() {
		return dbKategori.MyList(new tblkategori());
	}
	public void setKategoriListesi(List<tblkategori> kategoriListesi) {
		this.kategoriListesi = kategoriListesi;
	}
	public List<tblpages> getSayfaListesi() {
		return  dbPages.MyList(new tblpages());
	}
	public void setSayfaListesi(List<tblpages> sayfaListesi) {
		this.sayfaListesi = sayfaListesi;
	}
	
	

}
