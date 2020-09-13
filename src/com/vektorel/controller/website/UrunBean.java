package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.ResimDao;
import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblurun;
import com.vektorel.modelview.ModelWebUrunDetay;

@ManagedBean(name = "urunBean")
@SessionScoped
public class UrunBean {
	public static long urunId;
	private UrunDao DbUrun;
	private ModelWebUrunDetay model;
	public static int adet=1;
	private ResimDao DbResim;
	public UrunBean() {
		DbUrun = new UrunDao();
		DbResim = new ResimDao();
		model = new ModelWebUrunDetay();
		
	}
	
	public ModelWebUrunDetay getModel() {
		model.setUrun(DbUrun.GetbyId(urunId, new tblurun()));
		model.setUrunListesi(DbUrun.getAllByKategoriId(model.getUrun().getKategoriid()));
		model.setUrunResimListesi(DbResim.getAllByUrunId(urunId));
		return model;
	}
	public void setModel(ModelWebUrunDetay model) {
		this.model = model;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}
	
	
	
}
