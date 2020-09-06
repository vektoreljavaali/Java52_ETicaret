package com.vektorel.dao.website;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.model.tblurun;
import com.vektorel.utils.VeritabaniIsletimcisi;

public class UrunDao extends VeritabaniIsletimcisi<tblurun> {

	/**
	 * Bu Method sisteme son yüklenen üründen baþlamak üzere 
	 * istenilen miktarda ürünü dönderir.
	 * @param top -> kaç ürün görüntülemek istenildiðini belirtir.
	 * @return List<tblurun> ürün listesi döner
	 */
	public List<tblurun> sonYuklenenUrunler(int top, boolean first){
		//yeni bir boþ liste oluþtur
		List<tblurun> result;
		// tüm ürün listesi çek
		result = MyList(new tblurun());
		// kaç adet ürün var 
		int size = result.size()-1;
		// bu ürün listesinden sondan baþlayarak istenilen
		// kadar ürünü seç 
		if(first)
			result = result.subList(size-top, size);
		else
			result = result.subList(size-top*2, size-top);
		// seçilen ürünleri kullanýcýya dön.
		return result;
	}
	
}
