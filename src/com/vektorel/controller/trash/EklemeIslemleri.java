package com.vektorel.controller.trash;

import com.vektorel.dao.website.AnaSayfaDao;
import com.vektorel.dao.website.ResimDao;
import com.vektorel.dao.website.SiteDetayDao;
import com.vektorel.dao.website.UrunDao;
import com.vektorel.dao.website.UsersDao;
import com.vektorel.model.tblanasayfa;
import com.vektorel.model.tblresim;
import com.vektorel.model.tblsitedetail;
import com.vektorel.model.tblurun;
import com.vektorel.model.tblusers;

public class EklemeIslemleri {

	private UrunDao dburun;
	private AnaSayfaDao anasayfa;
	private SiteDetayDao siteDetayDao;
	private ResimDao dbresim;
	private UsersDao dbUsers;
	public EklemeIslemleri() {
		dburun = new UrunDao();
		anasayfa = new AnaSayfaDao();
		siteDetayDao = new SiteDetayDao();
		dbresim = new ResimDao();
		dbUsers = new UsersDao();
	}
	
	public void KullaniciEkle() {
		tblusers users = new tblusers();
		users.setAdsoyad("Muhammet HOCA");
		users.setKullaniciadi("muhammet");
		users.setSifre("123456");
		
		dbUsers.Save(users);
	}
	
	public void UrunEkleme() {
		
		tblurun ur;
		
		ur = new tblurun();
		ur.setAd("Bioderma Sensibio Foaming Jel 500 ml");
		ur.setAciklama("Bioderma Sensibio Foaming Jel 500 ml\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"*Y�z G�z Makyaj Temizli�i\r\n" + 
				"\r\n" + 
				"*Hassas ve Nem Kayb� Ya�ayan Ciltler ��in Temizleme Jeli\r\n" + 
				"\r\n" + 
				"*Cildi nazik�e temizlemeye, makyajdan ar�nd�rmaya ve nemlendirmeye yard�mc�d�r.\r\n" + 
				"\r\n" + 
				"*Hassas ciltlerin tolerans e�i�inin y�kseltilmesini destek olur.\r\n" + 
				"\r\n" + 
				"*Kremsi yap�daki k�p��� cilde yumu�akl�k ve konfor sa�lamaya yard�mc� olur.\r\n" + 
				"\r\n" + 
				"*Y�z ve g�z �evresi kullan�m�na uygundur.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Kullan�m �ekli\r\n" + 
				"\r\n" + 
				"�nceden su ile hafif�e �slat�lm�� nemli cilde uygulan�r. Y�ze uygularken k�p�rt�l�r ve ard�ndan bol su ile y�kan�r.Hafif�e kurulan�r.\r\n" + 
				"\r\n" + 
				"Sabah ve/veya ak�am kullan�m�na uygundur.");
		ur.setFiyat(68.85);
		ur.setKategoriid(1);
		ur.setOrtalamapuan(3);
		ur.setStok(20);
		ur.setAnaresim("img/product/biodermajel.jpg");
		dburun.Save(ur);
		
		ur = new tblurun();
		ur.setAd("La Roche-Posay Effaclar Jel Temizleme Jeli Ya�l�/Akneye E�ilim G�steren Ciltler 400Ml");
		ur.setAciklama("iyi bir �r�nd�r");
		ur.setFiyat(93.60);
		ur.setKategoriid(1);
		ur.setOrtalamapuan(5);
		ur.setStok(20);
		ur.setAnaresim("img/product/laroche.jpg");
		dburun.Save(ur);
		
		ur = new tblurun();
		ur.setAd("Samsung Galaxy Note 10 256 GB (Samsung T�rkiye Garantili)");
		ur.setAciklama("Samsung Galaxy Note 10 256 GB �zellikleri\r\n" + 
				" \r\n" + 
				"\r\n" + 
				"D�nyan�n en �nemli teknoloji �reticilerinden biri olan Samsung geli�tirmi� oldu�u Note serisi ile birbirinden kaliteli ak�ll� telefon se�enekleri tasarl�yor. Serinin son �rne�i olan Samsung Galaxy Note 10, g��l� i�lemcisi, yeni nesil yaz�l�mlar� ve sinematografik kameras� ile �n plana ��k�yor. Ak�ll� kalem se�ene�i ile birlikte sunulan �r�n, ekran� �ok y�nl� bir tablete ya da bilgisayara d�n��t�rebilmenize de imk�n tan�yor. Hem bir e�lence merkezi haline gelebilen hem de i�lerinizi y�r�tebilece�iniz bir telefon niteli�i ta��yan Samsung Galaxy Note 10, geni� haf�za se�ene�iyle de kullan�c�lar�na geli�mi� bir depolama alan� sa�l�yor. \r\n" + 
				"\r\n" + 
				"Estetik ve ��k Tasar�m Detaylar�\r\n" + 
				"\r\n" + 
				"Ergonomik bir tutu� ve zahmetsiz bir kullan�m imk�n� tan�yan Samsung Galaxy Note 10, g�steri�li ve karizmatik tasar�m�yla dikkat �ekiyor. 151.0 mm boy, 71.8 mm en ve 7.9 mm kal�nl�k �l��lerine sahip olan �r�n, �n panelinde 6,3 in�lik bir ekran bar�nd�r�yor. Sonsuz O-ekran olarak tasarlanm�� olan �n paneli, boydan boya ekran severler i�in benzersiz bir se�enek niteli�i ta��yor. 168 gram a��rl���ndaki �r�n, kavisli tasar�m� sayesinde tek elle kullan�m� destekliyor. Sorunsuz bir �ekilde tek elle kullan�m imk�n� tan�yan Samsung Galaxy Note 10, ay tozu grisi, duman siyah� ve fildi�i beyaz� gibi renk se�enekleri sunuyor. Dayan�kl� ve sa�lam Gorilla Glass 6 ile �retilen arka paneli, ����� yans�tarak yenilik�i ve g�steri�li bir atmosfer yarat�yor. Neredeyse tamamen ekrandan olu�an �n panelinde sadece kamera yer al�yor. Yan tarafta yer alan kontrol tu�lar� �r�ne g��l� bir g�r�nt� katarken, dayan�kl� arka paneli g�steri�li bir g�r�n�m sergiliyor. Arka panelde yer alan dikey olarak yerle�tirilmi� ��l� kamera ve fla� ����� telefonun g�r�nt�s�n� tamaml�yor. \r\n" + 
				"\r\n" + 
				"Geli�mi� Performans Sunan Samsung Galaxy Note 10 �zellikleri\r\n" + 
				"\r\n" + 
				"6,3 in� geni�li�e sahip OLED Dynamic AMOLED teknolojisi ile geli�tirilmi� olan ekran�, benzersiz bir g�r�nt� kalitesi sunuyor. 1080 x 2280 piksel ��z�n�rl��e sahip olan ekran�, Full HD g�r�nt�n�n hakk�n� veriyor. 1200 nit parlakl�k oran�na ve 2000000:1 kontrast de�erine sahip olan ekran�, t�m renkleri en g�z al�c� hali ile yans�t�yor. Ayr�ca Eye-Care teknolojisi ile tasarlanm�� olan ekran�, zararl� mavi ���klar� en aza indirerek g�z yorgunlu�u ve uyku bozuklu�unu da azaltmay� ama�l�yor.\r\n" + 
				"256 GB dahili haf�zas� ve 1 TB'a kadar microSD deste�i ile geni� bir depolama alan� sunan Samsung Galaxy Note 10, sevdi�iniz filmleri, uygulamalar�, oyunlar� ve videolar� ar�ivleyebilmenize imk�n tan�yor. Geni�leyebilen haf�zas� sayesinde bir veri deposu olarak kullanabilece�iniz �r�n, h�zl� aktar�m s�releriyle de dikkat �ekiyor.\r\n" + 
				"�oklu g�revleri, uygulama ge�i�lerini ve diledi�iniz her t�rl� i�lemi sorunsuz bir �ekilde yapabilmenizi sa�layan 7nm i�lemcisi, 8 GB RAM deste�i ile ak�c� ve h�zl� bir performans ortaya koyuyor. H�zl� ba�latma i�in pop�ler uygulamalar� �nceden y�kleyen ak�ll� i�lemcisi, telefon kullan�m deneyiminizi tamamen de�i�tiriyor. \r\n" + 
				"Wi-Fi 6 teknolojisi ile haz�rlanm�� olan Galaxy Note 10, internete daha h�zl� ba�lanabilmenize imk�n tan�yor. Wi-Fi kapsama alan� d���ndayken kullanabilece�iniz LTE ba�lant� se�ene�i 2.0Gbps h�z� destekliyor. Bu sayede her an her yerde online kalabilmenize ve d�nya ile ileti�ime ge�ebilmenize ortam haz�rl�yor.\r\n" + 
				"Samsung Dex teknolojisi ile geli�tirilmi� olan Galaxy Note 10, hem Mac hem de di�er bilgisayarlar i�in benzersiz bir deneyim sunuyor. USB kablo �zerinden kolayca bilgisayar�n�za ba�lanabilmenize ve dosyalar� ekranlar aras�nda s�r�kleyerek atabilmenize yard�mc� oluyor. Ekran yans�tma �zelli�i sayesinde geni� ekranlar �al��malar�n�z� g�rebilmenize olanak veriyor.");
		ur.setFiyat(6199.90);
		ur.setKategoriid(3);
		ur.setOrtalamapuan(5);
		ur.setStok(20);
		ur.setAnaresim("img/product/note10.jpg");
		dburun.Save(ur);
		ur = new tblurun();
		ur.setAd("Samsung Galaxy M11 32 GB (Samsung T�rkiye Garantili)");
		ur.setAciklama("Samsung Galaxy M11 �zellikleri\r\n" + 
				" \r\n" + 
				"\r\n" + 
				" \r\n" + 
				"\r\n" + 
				"D�nyan�n en �nemli ak�ll� telefon �reticilerinden biri olan Samsung'un geli�tirmi� oldu�u Samsung Galaxy M11, etkili ve g��l� performans detaylar� ile dikkat �ekiyor. Giri� seviyesinde ayarlanm�� olan Samsung M11 fiyatlar�, uygun se�enekleri ile her kesime ve b�t�eye hitap ediyor. Kaliteli detaylar ile s�slenmi� olan �r�n, kamera ve performans alan�nda etkili bir kullan�m sergiliyor. Geni� ekran� ile geli�mi� bir g�r�nt�leme alan� sa�layan Galaxy M11, oyun ve multimedya deneyimlerini iyile�tiriyor. Etkili kamera performans� sayesinde keyifli foto�raflar yakalaman�za yard�m eden �r�n, bataryas� ile de g�n boyu kullan�m� destekliyor.\r\n" + 
				"\r\n" + 
				"Estetik ve ��k Kullan�m Sa�layan Tasar�m Detaylar�\r\n" + 
				"\r\n" + 
				"Sonsuz U ekran teknolojisi ile haz�rlanm�� olan Samsung Galaxy M11, 6.4 in� geni�li�indeki ekran� ile keyifli bir telefon kullan�m� sa�l�yor. PLS ekran teknolojisi ile geli�tirilmi� olan ekran�, 720 x 1560 piksel ��z�n�rl��e sahip HD g�r�nt� kalitesi sergiliyor. Multi Touch �zelli�ine sahip kapasitif ekran�, kolay ve pratik bir deneyim ya�aman�z� sa�l�yor. �nce �er�eve tasar�m� ile haz�rlanm�� olan �r�n, %81.32 ekran g�vde oran�yla da dikkat �ekiyor. Oyun oynarken rahatl�k sa�layan geni� ekran�, film ve dizi izlerken de t�m ayr�nt�lara dikkat edebilmenize izin veriyor. �izilmelere kar�� diren�li cam olarak haz�rlanm�� olan �n panelini plastik ve g��l� malzemeden im�l edilmi� g�vde destekliyor. Yan taraf�nda yer alan g�� ve ses kontrol tu�lar�, telefona karizmatik ve etkili bir g�r�n�m kazand�r�yor. Mor, siyah ve turkuaz renk se�enekleri ile sunulan �r�n, her zevke hitap ediyor. Kavisli olarak tasarlanm�� olan g�vdesi, tek elle kullan�ma uygun bir se�enek olu�turuyor. Telefonun arka panelinde, ��l� kamera detaylar� ve parmak izi okuyucusu yer al�yor. �r�n�n g�r�nt�s�ne estetik bir dokunu� yapan arka paneli, ����� k�ran yap�s� sayesinde estetik ve ��k bir telefon g�r�n�m�n� m�mk�n k�l�yor.\r\n" + 
				"\r\n" + 
				"Samsung Galaxy M11 �zellikleri\r\n" + 
				"\r\n" + 
				"6.4 in� geni�li�inde haz�rlanm�� olan HD+ ekran�, oyun ve multimedya deneyimlerinizi iyile�tiriyor. Etkili ve keyifli bir telefon kullan�m�n� m�mk�n k�lan ekran�, 268 PPI piksel yo�unlu�u ile ba�ar�l� bir g�r�nt�leme �zelli�i sunuyor. �er�evesiz tasar�m �zelli�i sayesinde ekran� etkili bir �ekilde kullanabilmenize yard�m eden Galaxy M11, oyun i�erisindeki ayr�nt�lar� en net �ekilde g�rebilmenize ve karanl�k ortama sahip filmleri bile keyifli bir �ekilde izleyebilmenize izin veriyor.\r\n" + 
				"3 GB RAM deste�ine sahip Samsung Galaxy M11, uygulama ge�i�lerini ve �oklu g�revleri sorunsuz bir �ekilde ger�ekle�tirebilmenize ortam haz�rl�yor. 14 nm CPU teknoloji ile haz�rlanm�� �r�n, yo�un g�� gerektiren anlarda bile performans� koruyarak telefon kullan�m�n�z�n olumsuz etkilenmesini engelliyor.");
		ur.setFiyat(1999.90);
		ur.setKategoriid(3);
		ur.setOrtalamapuan(4);
		ur.setStok(20);
		ur.setAnaresim("img/product/galaxim11.jpg");
		dburun.Save(ur);
	}
	
	public void UrunResimEkleme() {
		tblresim resim;
		resim = new tblresim();
		resim.setResimurl("img/product/img_detay/note_1.jpg");		
		resim.setUrunid(3);
		dbresim.Save(resim);
		
		resim = new tblresim();
		resim.setResimurl("img/product/img_detay/note_2.jpg");		
		resim.setUrunid(3);
		dbresim.Save(resim);
		
		resim = new tblresim();
		resim.setResimurl("img/product/img_detay/note_3.jpg");		
		resim.setUrunid(3);
		dbresim.Save(resim);
		
		resim = new tblresim();
		resim.setResimurl("img/product/img_detay/note_4.jpg");		
		resim.setUrunid(3);
		dbresim.Save(resim);
		
	}
	
	public void AnaSayfaEkleme() {
		
		tblanasayfa sf = new tblanasayfa();
		sf.setKampanya_1_url("img/banner/banner-1.jpg");
		sf.setKampanya_1_url("img/banner/banner-2.jpg");
		
		anasayfa.Save(sf);
	}
		
	public void SiteDetayEkleme(){
		tblsitedetail detay = new tblsitedetail();
		detay.setAdres("Ankara Merkez k�z�lay caddesi");
		detay.setEmail("vektorel@gmail.com");
		detay.setFacebook("https://www.facebook.com");
		detay.setFirmaadi("E-Ticaret Sistemi A.�.");
		detay.setFirmalink("www.google.com");
		detay.setInstagram("");
		detay.setTelefon("0 555 666 11 22");
		detay.setTwitter("");
		
		siteDetayDao.Save(detay);		
	} 
}
