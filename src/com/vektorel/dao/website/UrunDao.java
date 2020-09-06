package com.vektorel.dao.website;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.model.tblurun;
import com.vektorel.utils.VeritabaniIsletimcisi;

public class UrunDao extends VeritabaniIsletimcisi<tblurun> {

	/**
	 * Bu Method sisteme son y�klenen �r�nden ba�lamak �zere 
	 * istenilen miktarda �r�n� d�nderir.
	 * @param top -> ka� �r�n g�r�nt�lemek istenildi�ini belirtir.
	 * @return List<tblurun> �r�n listesi d�ner
	 */
	public List<tblurun> sonYuklenenUrunler(int top, boolean first){
		//yeni bir bo� liste olu�tur
		List<tblurun> result;
		// t�m �r�n listesi �ek
		result = MyList(new tblurun());
		// ka� adet �r�n var 
		int size = result.size()-1;
		// bu �r�n listesinden sondan ba�layarak istenilen
		// kadar �r�n� se� 
		if(first)
			result = result.subList(size-top, size);
		else
			result = result.subList(size-top*2, size-top);
		// se�ilen �r�nleri kullan�c�ya d�n.
		return result;
	}
	
}
