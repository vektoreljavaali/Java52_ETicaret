package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblurun;
import com.vektorel.modelview.ModelWebUrunDetay;

@ManagedBean(name = "urunBean")
@SessionScoped
public class UrunBean {
	public static long urunId;
	private UrunDao DbUrun;
	private ModelWebUrunDetay model;
	public UrunBean() {
		DbUrun = new UrunDao();
		model = new ModelWebUrunDetay();
	}
	
	public ModelWebUrunDetay getModel() {
		model.setUrun(DbUrun.GetbyId(urunId, new tblurun()));
		model.setUrunListesi(DbUrun.getAllByKategoriId(model.getUrun().getKategoriid()));
		return model;
	}
	public void setModel(ModelWebUrunDetay model) {
		this.model = model;
	}
	
	
	
}
