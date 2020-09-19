package com.vektorel.controller.website;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.controller.trash.EklemeIslemleri;
import com.vektorel.dao.website.AnaSayfaDao;
import com.vektorel.dao.website.KategoriDao;
import com.vektorel.dao.website.PagesDao;
import com.vektorel.dao.website.SiteDetayDao;
import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblanasayfa;
import com.vektorel.model.tblkategori;
import com.vektorel.model.tblpages;
import com.vektorel.model.tblsitedetail;
import com.vektorel.model.tblurun;
import com.vektorel.modelview.ModelWebSiteIndex;

@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean {

	
	private ModelWebSiteIndex model;
	private PagesDao dbPages;
    private KategoriDao DbKategori; 
    private UrunDao DbUrun;
    private AnaSayfaDao DbAnaSayfa;
    private SiteDetayDao siteDetayDao;
	// Constructor -> Kurucu method
	public IndexBean() {
		// Kategori Db i�lemlerini yapmak i�in 
		// yeni bir kategori nesnedi olu�turulur.
		DbKategori = new KategoriDao();
		dbPages = new PagesDao();
		DbUrun = new UrunDao();
		DbAnaSayfa = new AnaSayfaDao();
		siteDetayDao = new SiteDetayDao();
		
		// �ndex sayfam�zda kullan�lmak �zere yeni bir model
		// olu�turuyoruz. bunun i�ine kategori listesi
		// �r�n listesi, duyurular, 
		model = new ModelWebSiteIndex();
		
		//PagesAdd();
		//Ekleme();
		//new EklemeIslemleri().UrunEkleme();
		//new EklemeIslemleri().UrunEkleme();
		//new EklemeIslemleri().AnaSayfaEkleme();
		//new EklemeIslemleri().SiteDetayEkleme();
		//new EklemeIslemleri().UrunResimEkleme();
		//new EklemeIslemleri().KullaniciEkle();
		// sayfam�z i�in kullanaca��m�z modele db den �ekmi� oldu�umuz
		// verileri y�kl�yoruz.
		model.setListeKategori(DbKategori.MyList(new tblkategori()));
		model.setListeUrun(DbUrun.MyList(new tblurun()));
		model.setAnasayfa(DbAnaSayfa.GetbyId(1,new tblanasayfa()));
		model.setSonEklenenUrunler1(DbUrun.sonYuklenenUrunler(3,true));
		model.setSonEklenenUrunler2(DbUrun.sonYuklenenUrunler(3,false));
		model.setSiteDetayBilgileri(siteDetayDao.GetbyId(1, new tblsitedetail()));
		
	}
	
	private void PagesAdd() {
		dbPages = new PagesDao();
		
		tblpages page;
		
		 page = new tblpages();
		 page.setAd("Home");
		 page.setParentid(0);
		 page.setUrl("index.xhtml");
		 
		 dbPages.Save(page);
		
		 page = new tblpages();
		 page.setAd("Shop");
		 page.setParentid(0);
		 page.setUrl("shop.xhtml");
		 
		 dbPages.Save(page);
		 page = new tblpages();
		 page.setAd("Pages");
		 page.setParentid(0);
		 page.setUrl("pages.xhtml");
		 
		 dbPages.Save(page);
		 page = new tblpages();
		 page.setAd("Contact");
		 page.setParentid(0);
		 page.setUrl("contact.xhtml");
		 
		 dbPages.Save(page);
	}
	
	public void Ekleme() {
		
		tblkategori kategori;
		
		// yeni bir kategori nesnesi olu�turyoruz
		kategori = new tblkategori();
		kategori.setAd("Kozmetik");
		kategori.setResimurl("img/categories/cat-3.jpg");
		// olu�turdu�umuz kategoriyi kay�t ediyoruz.
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("S�permarket");
		kategori.setResimurl("img/categories/cat-4.jpg");
		
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Telefon");
		kategori.setResimurl("img/categories/cat-5.jpg");
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Beyaz E�ya");
		kategori.setResimurl("img/categories/cat-1.jpg");		
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Mobilya");
		kategori.setResimurl("img/categories/cat-2.jpg");		
		DbKategori.Save(kategori);
		
	}
	
	public ModelWebSiteIndex getModel() {
		return model;
	}

	public void setModel(ModelWebSiteIndex model) {
		this.model = model;
	}

	
	public void urlSec(int id) {
		System.out.println("Se�inlen id...: "+ id);
		
	}
}
