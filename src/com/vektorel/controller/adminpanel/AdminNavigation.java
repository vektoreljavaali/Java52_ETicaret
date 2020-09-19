package com.vektorel.controller.adminpanel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.controller.website.KategoriBean;

@SessionScoped
@ManagedBean(name = "adminNavigation")
public class AdminNavigation {

	private String MainPage = "dashboard.xhtml";

	public void urlSec(int id) {
		KategoriBean.kategoriId = id;
		switch (id) {
		case 1: MainPage = "urunekle.xhtml";break;
		case 2: MainPage = "urunlistesi.xhtml";break;
		case 3: MainPage = "borclumusteriler.xhtml";break;
		default:MainPage = "urunekle.xhtml";break;
		}
		
	}

	public String getMainPage() {
		return MainPage;
	}

	public void setMainPage(String mainPage) {
		MainPage = mainPage;
	}
	
	
	
	
}
