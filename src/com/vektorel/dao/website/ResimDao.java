package com.vektorel.dao.website;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.model.tblresim;
import com.vektorel.utils.VeritabaniIsletimcisi;

public class ResimDao extends VeritabaniIsletimcisi<tblresim> {

	/**
	 * �r�n id si verilen �r�ne ait t�m resimleri geri d�nen methoddur.
	 * @param urunId -> long tipinde �r�ne ait id dir
	 * @return -> List<tblresim> tipinde resim listesi d�ner
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
