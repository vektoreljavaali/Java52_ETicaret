package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.controller.trash.EklemeIslemleri;
import com.vektorel.dao.website.KategoriDao;
import com.vektorel.dao.website.PagesDao;
import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblkategori;
import com.vektorel.model.tblpages;
import com.vektorel.model.tblurun;
import com.vektorel.modelview.ModelWebSiteIndex;

@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean {

	private ModelWebSiteIndex model;
	private PagesDao dbPages;
    private KategoriDao DbKategori; 
    private UrunDao DbUrun;
	// Constructor -> Kurucu method
	public IndexBean() {
		// Kategori Db iþlemlerini yapmak için 
		// yeni bir kategori nesnedi oluþturulur.
		DbKategori = new KategoriDao();
		dbPages = new PagesDao();
		DbUrun = new UrunDao();
		// Ýndex sayfamýzda kullanýlmak üzere yeni bir model
		// oluþturuyoruz. bunun içine kategori listesi
		// ürün listesi, duyurular, 
		model = new ModelWebSiteIndex();
		//PagesAdd();
		//Ekleme();
		new EklemeIslemleri().UrunEkleme();
		// sayfamýz için kullanacaðýmýz modele db den çekmiþ olduðumuz
		// verileri yüklüyoruz.
		model.setListeKategori(DbKategori.MyList(new tblkategori()));
		model.setListeUrun(DbUrun.MyList(new tblurun()));
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
		
		// yeni bir kategori nesnesi oluþturyoruz
		kategori = new tblkategori();
		kategori.setAd("Kozmetik");
		kategori.setResimurl("img/categories/cat-3.jpg");
		// oluþturduðumuz kategoriyi kayýt ediyoruz.
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Süpermarket");
		kategori.setResimurl("img/categories/cat-4.jpg");
		
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Telefon");
		kategori.setResimurl("img/categories/cat-5.jpg");
		DbKategori.Save(kategori);
		
		kategori = new tblkategori();
		kategori.setAd("Beyaz Eþya");
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
	
	
}
