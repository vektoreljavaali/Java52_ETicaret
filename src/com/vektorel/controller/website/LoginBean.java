package com.vektorel.controller.website;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.vektorel.dao.website.UsersDao;
import com.vektorel.model.tblusers;
import com.vektorel.utils.NavigationBean;
import com.vektorel.utils.StaticValues;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {

	private String email;
	private String password= "************** ";
	private UsersDao dbUsers;
	// bir kullanýcý eðer sisteme giriþ yapmýþ ise bu deðer true olur.
	public boolean isLogin = false;
	private String Hata ="";
	
	@ManagedProperty(value = "#{navigationBean}")
	private NavigationBean navigationBean;
	
	public String GirisYap() {
		dbUsers = new UsersDao();
		// kullanýcý yok ise ya da þifresi hatalý ise bu iþlem yapýlýr
		tblusers user = dbUsers.getByUserNameAndPassword(email, password);
		if(user==null)
		{
			isLogin = false;
			Hata = "Kullanýcý adý ya da Þifre Hatalýdýr.";
			return navigationBean.toLogin();					
		}
		else {
			isLogin=true;
			StaticValues.user = user;
			return navigationBean.welcomeToAdmin();
		}
	}
	
	
	
	public NavigationBean getNavigationBean() {
		return navigationBean;
	}
	public void setNavigationBean(NavigationBean navigationBean) {
		this.navigationBean = navigationBean;
	}
	public String getHata() {
		return Hata;
	}
	public void setHata(String hata) {
		Hata = hata;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
