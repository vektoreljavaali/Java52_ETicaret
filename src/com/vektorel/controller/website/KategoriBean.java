package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.KategoriDao;
import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblkategori;
import com.vektorel.model.tblurun;
import com.vektorel.modelview.ModelWebKategori;

@ManagedBean(name = "kategoriBean")
@SessionScoped
public class KategoriBean {

	public static int kategoriId;
	private KategoriDao DbKategori;
	private UrunDao DbUrun;
	private ModelWebKategori model;
	public KategoriBean() {
		DbKategori = new KategoriDao();
		DbUrun = new UrunDao();
		model = new ModelWebKategori();
	}
	

	public ModelWebKategori getModel() {
		model.setKategoriListesi(DbKategori.MyList(new tblkategori()));
		if(kategoriId<=0)
			model.setUrunListesi(DbUrun.MyList(new tblurun()));
		else
			model.setUrunListesi(DbUrun.getAllByKategoriId(kategoriId));
		return model;
	}

	public void setModel(ModelWebKategori model) {
		this.model = model;
	}
	
	
}
