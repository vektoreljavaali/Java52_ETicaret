package com.vektorel.dao.website;

import com.vektorel.model.tblusers;
import com.vektorel.utils.VeritabaniIsletimcisi;

public class UsersDao extends VeritabaniIsletimcisi<tblusers>{

	public tblusers getByUserNameAndPassword(String kullaniciadi, String sifre) {
		tblusers result=null;
		for (tblusers item : MyList(new tblusers())) {
			if(item.getKullaniciadi().equals(kullaniciadi) && item.getSifre().equals(sifre))
				result = item;
		}
		return result;
	} 
	
	
}
