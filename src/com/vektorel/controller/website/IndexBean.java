package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.KategoriDao;
import com.vektorel.model.tblkategori;
import com.vektorel.modelview.ModelWebSiteIndex;

@ManagedBean(name = "indexBean")
@SessionScoped
public class IndexBean {

	private ModelWebSiteIndex model;
    private KategoriDao DbKategori; 
	// Constructor -> Kurucu method
	public IndexBean() {
		// Kategori Db iþlemlerini yapmak için 
		// yeni bir kategori nesnedi oluþturulur.
		DbKategori = new KategoriDao();
		// Ýndex sayfamýzda kullanýlmak üzere yeni bir model
		// oluþturuyoruz. bunun içine kategori listesi
		// ürün listesi, duyurular, 
		model = new ModelWebSiteIndex();
		
		//Ekleme();
		
		// sayfamýz için kullanacaðýmýz modele db den çekmiþ olduðumuz
		// verileri yüklüyoruz.
		model.setListKategori(DbKategori.MyList(new tblkategori()));
		
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
