package com.vektorel.modelview;

import java.util.List;

import com.vektorel.dao.website.AnaSayfaDao;
import com.vektorel.model.tblanasayfa;
import com.vektorel.model.tblkategori;
import com.vektorel.model.tblpages;
import com.vektorel.model.tblsitedetail;
import com.vektorel.model.tblurun;

public class ModelWebSiteIndex {

	private List<tblkategori> listeKategori;
	private List<tblurun> listeUrun;
	private tblanasayfa anasayfa;
	private List<tblurun> sonEklenenUrunler1;
	private List<tblurun> sonEklenenUrunler2;
	private tblsitedetail SiteDetayBilgileri;
	
	

	public tblsitedetail getSiteDetayBilgileri() {
		return SiteDetayBilgileri;
	}

	public void setSiteDetayBilgileri(tblsitedetail siteDetayBilgileri) {
		SiteDetayBilgileri = siteDetayBilgileri;
	}

	public List<tblurun> getSonEklenenUrunler1() {
		return sonEklenenUrunler1;
	}

	public void setSonEklenenUrunler1(List<tblurun> sonEklenenUrunler1) {
		this.sonEklenenUrunler1 = sonEklenenUrunler1;
	}

	public List<tblurun> getSonEklenenUrunler2() {
		return sonEklenenUrunler2;
	}

	public void setSonEklenenUrunler2(List<tblurun> sonEklenenUrunler2) {
		this.sonEklenenUrunler2 = sonEklenenUrunler2;
	}

	public tblanasayfa getAnasayfa() {
		return anasayfa;
	}

	public void setAnasayfa(tblanasayfa anasayfa) {
		this.anasayfa = anasayfa;
	}

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
