package com.vektorel.dao.website;

import java.util.ArrayList;
import java.util.List;

import com.vektorel.model.tblsepet;
import com.vektorel.model.tblurun;
import com.vektorel.utils.StaticValues;
import com.vektorel.utils.VeritabaniIsletimcisi;

public class SepetDao extends VeritabaniIsletimcisi<tblsepet> {

	UrunDao DbUrun;
	
	public SepetDao() {
		DbUrun = new UrunDao();
	}
	
	/**
	 * Kullan�c� id si verilen ki�iye ait sepet listesini d�necektir.
	 * @param userId
	 * @return
	 */
	public List<tblsepet> getAllByUserId(long userId){
		List<tblsepet> result = new ArrayList<tblsepet>();
		for (tblsepet item : MyList(new tblsepet())) {
			if(item.getUserid()==userId)
				result.add(item);
		}
		return result;
	}
	
	/**
	 * Verilen �r�n id sine g�re sepette b�yle bir kay�t olup olmad���n� d�ner
	 * @param urunId
	 * @return
	 */
	public tblsepet getByUrunId(long urunId) {
		tblsepet result= null;
		for (tblsepet item : MyList(new tblsepet())) {
			if(item.getUrunid()==urunId)
				result = item;
		}
		return result;
	}
	
	public void SepeteEkle(long urunId, long userId, int adet) {
		
		// Ki�i daha �nce sepetine hi� �r�n eklememi� ise,
		if(getAllByUserId(StaticValues.UserId).size()<=0) {
			tblsepet sepet = new tblsepet();
			tblurun  urun = DbUrun.GetbyId(urunId, new tblurun());
			sepet.setAdet(adet);
			sepet.setDurum(0);
			sepet.setFiyat(urun.getFiyat());
			sepet.setResimurl(urun.getAnaresim());
			sepet.setToplamfiyat(urun.getFiyat()*adet);
			sepet.setUrunadi(urun.getAd());
			sepet.setUrunid(urunId);
			sepet.setUserid(StaticValues.UserId);
			Save(sepet);
		}
		else{
			tblsepet sepet = getByUrunId(urunId);
			if(sepet==null) {
				sepet = new tblsepet();
				tblurun  urun = DbUrun.GetbyId(urunId, new tblurun());
				sepet.setAdet(adet);
				sepet.setDurum(0);
				sepet.setFiyat(urun.getFiyat());
				sepet.setResimurl(urun.getAnaresim());
				sepet.setToplamfiyat(urun.getFiyat()*adet);
				sepet.setUrunadi(urun.getAd());
				sepet.setUrunid(urunId);
				sepet.setUserid(StaticValues.UserId);
				Save(sepet);
			}else
			{
				sepet.setAdet(sepet.getAdet()+adet);
				Update(sepet);
			}
		}
		
	}
	
}
