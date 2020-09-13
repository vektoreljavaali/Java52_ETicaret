package com.vektorel.controller.website;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.SepetDao;
import com.vektorel.dao.website.UrunDao;
import com.vektorel.model.tblsepet;
import com.vektorel.model.tblurun;
import com.vektorel.utils.StaticValues;

@ManagedBean(name = "sepetBean")
@SessionScoped
public class SepetBean {

	public static long urunId;
	public static boolean isAdding=false;
	public static int adet=1;
	private List<tblsepet> sepetListesi;
	private SepetDao DbSepet;
	private UrunDao DbUrun;
	private double TumToplam;
	public SepetBean() {
		DbSepet = new SepetDao();
		DbUrun = new UrunDao();
		if(isAdding) DbSepet.SepeteEkle(urunId, StaticValues.UserId, adet);
		
	}
		
	public List<tblsepet> getSepetListesi() {
		TumToplam = 0;
		List<tblsepet> liste = DbSepet.getAllByUserId(StaticValues.UserId);
		for (tblsepet item : liste) {
			TumToplam += item.getToplamfiyat();
		}
		return liste;
	}

	public void setSepetListesi(List<tblsepet> sepetListesi) {
		this.sepetListesi = sepetListesi;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}


	public double getTumToplam() {
		return TumToplam;
	}


	public void setTumToplam(double tumToplam) {
		TumToplam = tumToplam;
	}
	
	
	
}
