package com.vektorel.controller.adminpanel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.model.tblusers;
import com.vektorel.utils.StaticValues;

@SessionScoped
@ManagedBean(name = "adminIndexBean")
public class AdminIndexBean {

	private tblusers user;

	
	
	public tblusers getUser() {
		return StaticValues.user;
	}

	public void setUser(tblusers user) {
		this.user = user;
	}
	
	
	
}
