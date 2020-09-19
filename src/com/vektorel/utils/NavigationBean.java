package com.vektorel.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "navigationBean")
public class NavigationBean {

	public String toLogin() {
		return "/login.jsf";
	}
	
	public String redirectToLogin() {
		return "/login.jsf?faces-redirect=true";
	}
	
	public String toAdmin() {
		return "/adminPanel/index.jsf";
	}
	
	public String welcomeToAdmin() {
		return "/adminPanel/index.jsf?faces-redirect=true";
	}
}
