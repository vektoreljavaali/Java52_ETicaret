package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Navigations {

	private String MainPage = "body.xhtml";

	public void urlSec(int id) {
		System.out.println("Se�ilen id..: "+ id);
		switch (id) {
		case 1: MainPage = "kategori.xhtml";break;
		case 2: MainPage = "kategori.xhtml";break;
		case 3: MainPage = "kategori.xhtml";break;
		default:MainPage = "kategori.xhtml";break;
		}
		
	}
	
	
	public String getMainPage() {
		return MainPage;
	}

	public void setMainPage(String mainPage) {
		MainPage = mainPage;
	}
	
	
	
}
