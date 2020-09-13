package com.vektorel.dao.website;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.model.tblresim;
import com.vektorel.utils.VeritabaniIsletimcisi;

public class ResimDao extends VeritabaniIsletimcisi<tblresim> {

	/**
	 * Ürün id si verilen ürüne ait tüm resimleri geri dönen methoddur.
	 * @param urunId -> long tipinde ürüne ait id dir
	 * @return -> List<tblresim> tipinde resim listesi döner
	 */
	public List<tblresim> getAllByUrunId(long urunId){
		List<tblresim> result = new ArrayList<tblresim>();
		for (tblresim item : MyList(new tblresim())) {
			if(item.getUrunid()==urunId)
				result.add(item);
		}
		return result;
	}
	
}
