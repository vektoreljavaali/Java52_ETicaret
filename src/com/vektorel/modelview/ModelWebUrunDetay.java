package com.vektorel.modelview;

import java.util.List;

import com.vektorel.model.tblurun;

public class ModelWebUrunDetay {

	private tblurun urun;
	private List<tblurun> urunListesi;
	
	
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
