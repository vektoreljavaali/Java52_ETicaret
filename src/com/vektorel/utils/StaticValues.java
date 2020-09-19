package com.vektorel.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.model.tblusers;

@ManagedBean
@SessionScoped
public class StaticValues {

	public static long UserId= 2; 
	public static tblusers user;
}
