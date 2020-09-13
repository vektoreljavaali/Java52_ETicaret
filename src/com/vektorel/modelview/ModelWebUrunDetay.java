package com.vektorel.modelview;

import java.util.List;

import com.vektorel.model.tblresim;
import com.vektorel.model.tblurun;

public class ModelWebUrunDetay {
	// Sayfa da ürünün detaylarýnýn görüntülenmesi için gerkelidir
	private tblurun urun;
	// alt kýsýmda benzer ürünleri görüntülenmesi içindir.
	private List<tblurun> urunListesi;
	// sayfada ürüne ait resimlerin gösterilmesi için kullanýlrý.
	private List<tblresim> urunResimListesi;
	
	
	
	public List<tblresim> getUrunResimListesi() {
		return urunResimListesi;
	}

	public void setUrunResimListesi(List<tblresim> urunResimListesi) {
		this.urunResimListesi = urunResimListesi;
	}

	public List<tblurun> getUrunListesi() {
		return urunListesi;
	}

	public void setUrunListesi(List<tblurun> urunListesi) {
		this.urunListesi = urunListesi;
	}

	public tblurun getUrun() {
		return urun;
	}

	public void setUrun(tblurun urun) {
		this.urun = urun;
	}
	
	
}
