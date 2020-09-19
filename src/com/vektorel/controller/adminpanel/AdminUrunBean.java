package com.vektorel.controller.adminpanel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblurun;

@SessionScoped
@ManagedBean(name = "adminUrunBean")
public class AdminUrunBean {
	
	private tblurun urun;

	private UrunDao dbUrun;
	
	public AdminUrunBean() {
		dbUrun = new UrunDao();
		urun = new tblurun();
	}
	
	public void UrunKayit() {
		dbUrun.Save(urun);
	}
	
	public tblurun getUrun() {
		return urun;
	}

	public void setUrun(tblurun urun) {
		this.urun = urun;
	}
	
	

}
