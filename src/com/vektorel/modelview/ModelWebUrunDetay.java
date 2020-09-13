package com.vektorel.modelview;

import java.util.List;

import com.vektorel.model.tblresim;
import com.vektorel.model.tblurun;

public class ModelWebUrunDetay {
	// Sayfa da �r�n�n detaylar�n�n g�r�nt�lenmesi i�in gerkelidir
	private tblurun urun;
	// alt k�s�mda benzer �r�nleri g�r�nt�lenmesi i�indir.
	private List<tblurun> urunListesi;
	// sayfada �r�ne ait resimlerin g�sterilmesi i�in kullan�lr�.
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
