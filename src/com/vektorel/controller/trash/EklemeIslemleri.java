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
				"*Yüz Göz Makyaj Temizliði\r\n" + 
				"\r\n" + 
				"*Hassas ve Nem Kaybý Yaþayan Ciltler Ýçin Temizleme Jeli\r\n" + 
				"\r\n" + 
				"*Cildi nazikçe temizlemeye, makyajdan arýndýrmaya ve nemlendirmeye yardýmcýdýr.\r\n" + 
				"\r\n" + 
				"*Hassas ciltlerin tolerans eþiðinin yükseltilmesini destek olur.\r\n" + 
				"\r\n" + 
				"*Kremsi yapýdaki köpüðü cilde yumuþaklýk ve konfor saðlamaya yardýmcý olur.\r\n" + 
				"\r\n" + 
				"*Yüz ve göz çevresi kullanýmýna uygundur.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Kullaným Þekli\r\n" + 
				"\r\n" + 
				"Önceden su ile hafifçe ýslatýlmýþ nemli cilde uygulanýr. Yüze uygularken köpürtülür ve ardýndan bol su ile yýkanýr.Hafifçe kurulanýr.\r\n" + 
				"\r\n" + 
				"Sabah ve/veya akþam kullanýmýna uygundur.");
		ur.setFiyat(68.85);
		ur.setKategoriid(1);
		ur.setOrtalamapuan(3);
		ur.setStok(20);
		ur.setAnaresim("img/product/biodermajel.jpg");
		dburun.Save(ur);
		
		ur = new tblurun();
		ur.setAd("La Roche-Posay Effaclar Jel Temizleme Jeli Yaðlý/Akneye Eðilim Gösteren Ciltler 400Ml");
		ur.setAciklama("iyi bir üründür");
		ur.setFiyat(93.60);
		ur.setKategoriid(1);
		ur.setOrtalamapuan(5);
		ur.setStok(20);
		ur.setAnaresim("img/product/laroche.jpg");
		dburun.Save(ur);
		
		ur = new tblurun();
		ur.setAd("Samsung Galaxy Note 10 256 GB (Samsung Türkiye Garantili)");
		ur.setAciklama("Samsung Galaxy Note 10 256 GB Özellikleri\r\n" + 
				" \r\n" + 
				"\r\n" + 
				"Dünyanýn en önemli teknoloji üreticilerinden biri olan Samsung geliþtirmiþ olduðu Note serisi ile birbirinden kaliteli akýllý telefon seçenekleri tasarlýyor. Serinin son örneði olan Samsung Galaxy Note 10, güçlü iþlemcisi, yeni nesil yazýlýmlarý ve sinematografik kamerasý ile ön plana çýkýyor. Akýllý kalem seçeneði ile birlikte sunulan ürün, ekraný çok yönlü bir tablete ya da bilgisayara dönüþtürebilmenize de imkân tanýyor. Hem bir eðlence merkezi haline gelebilen hem de iþlerinizi yürütebileceðiniz bir telefon niteliði taþýyan Samsung Galaxy Note 10, geniþ hafýza seçeneðiyle de kullanýcýlarýna geliþmiþ bir depolama alaný saðlýyor. \r\n" + 
				"\r\n" + 
				"Estetik ve Þýk Tasarým Detaylarý\r\n" + 
				"\r\n" + 
				"Ergonomik bir tutuþ ve zahmetsiz bir kullaným imkâný tanýyan Samsung Galaxy Note 10, gösteriþli ve karizmatik tasarýmýyla dikkat çekiyor. 151.0 mm boy, 71.8 mm en ve 7.9 mm kalýnlýk ölçülerine sahip olan ürün, ön panelinde 6,3 inçlik bir ekran barýndýrýyor. Sonsuz O-ekran olarak tasarlanmýþ olan ön paneli, boydan boya ekran severler için benzersiz bir seçenek niteliði taþýyor. 168 gram aðýrlýðýndaki ürün, kavisli tasarýmý sayesinde tek elle kullanýmý destekliyor. Sorunsuz bir þekilde tek elle kullaným imkâný tanýyan Samsung Galaxy Note 10, ay tozu grisi, duman siyahý ve fildiþi beyazý gibi renk seçenekleri sunuyor. Dayanýklý ve saðlam Gorilla Glass 6 ile üretilen arka paneli, ýþýðý yansýtarak yenilikçi ve gösteriþli bir atmosfer yaratýyor. Neredeyse tamamen ekrandan oluþan ön panelinde sadece kamera yer alýyor. Yan tarafta yer alan kontrol tuþlarý ürüne güçlü bir görüntü katarken, dayanýklý arka paneli gösteriþli bir görünüm sergiliyor. Arka panelde yer alan dikey olarak yerleþtirilmiþ üçlü kamera ve flaþ ýþýðý telefonun görüntüsünü tamamlýyor. \r\n" + 
				"\r\n" + 
				"Geliþmiþ Performans Sunan Samsung Galaxy Note 10 Özellikleri\r\n" + 
				"\r\n" + 
				"6,3 inç geniþliðe sahip OLED Dynamic AMOLED teknolojisi ile geliþtirilmiþ olan ekraný, benzersiz bir görüntü kalitesi sunuyor. 1080 x 2280 piksel çözünürlüðe sahip olan ekraný, Full HD görüntünün hakkýný veriyor. 1200 nit parlaklýk oranýna ve 2000000:1 kontrast deðerine sahip olan ekraný, tüm renkleri en göz alýcý hali ile yansýtýyor. Ayrýca Eye-Care teknolojisi ile tasarlanmýþ olan ekraný, zararlý mavi ýþýklarý en aza indirerek göz yorgunluðu ve uyku bozukluðunu da azaltmayý amaçlýyor.\r\n" + 
				"256 GB dahili hafýzasý ve 1 TB'a kadar microSD desteði ile geniþ bir depolama alaný sunan Samsung Galaxy Note 10, sevdiðiniz filmleri, uygulamalarý, oyunlarý ve videolarý arþivleyebilmenize imkân tanýyor. Geniþleyebilen hafýzasý sayesinde bir veri deposu olarak kullanabileceðiniz ürün, hýzlý aktarým süreleriyle de dikkat çekiyor.\r\n" + 
				"Çoklu görevleri, uygulama geçiþlerini ve dilediðiniz her türlü iþlemi sorunsuz bir þekilde yapabilmenizi saðlayan 7nm iþlemcisi, 8 GB RAM desteði ile akýcý ve hýzlý bir performans ortaya koyuyor. Hýzlý baþlatma için popüler uygulamalarý önceden yükleyen akýllý iþlemcisi, telefon kullaným deneyiminizi tamamen deðiþtiriyor. \r\n" + 
				"Wi-Fi 6 teknolojisi ile hazýrlanmýþ olan Galaxy Note 10, internete daha hýzlý baðlanabilmenize imkân tanýyor. Wi-Fi kapsama alaný dýþýndayken kullanabileceðiniz LTE baðlantý seçeneði 2.0Gbps hýzý destekliyor. Bu sayede her an her yerde online kalabilmenize ve dünya ile iletiþime geçebilmenize ortam hazýrlýyor.\r\n" + 
				"Samsung Dex teknolojisi ile geliþtirilmiþ olan Galaxy Note 10, hem Mac hem de diðer bilgisayarlar için benzersiz bir deneyim sunuyor. USB kablo üzerinden kolayca bilgisayarýnýza baðlanabilmenize ve dosyalarý ekranlar arasýnda sürükleyerek atabilmenize yardýmcý oluyor. Ekran yansýtma özelliði sayesinde geniþ ekranlar çalýþmalarýnýzý görebilmenize olanak veriyor.");
		ur.setFiyat(6199.90);
		ur.setKategoriid(3);
		ur.setOrtalamapuan(5);
		ur.setStok(20);
		ur.setAnaresim("img/product/note10.jpg");
		dburun.Save(ur);
		ur = new tblurun();
		ur.setAd("Samsung Galaxy M11 32 GB (Samsung Türkiye Garantili)");
		ur.setAciklama("Samsung Galaxy M11 Özellikleri\r\n" + 
				" \r\n" + 
				"\r\n" + 
				" \r\n" + 
				"\r\n" + 
				"Dünyanýn en önemli akýllý telefon üreticilerinden biri olan Samsung'un geliþtirmiþ olduðu Samsung Galaxy M11, etkili ve güçlü performans detaylarý ile dikkat çekiyor. Giriþ seviyesinde ayarlanmýþ olan Samsung M11 fiyatlarý, uygun seçenekleri ile her kesime ve bütçeye hitap ediyor. Kaliteli detaylar ile süslenmiþ olan ürün, kamera ve performans alanýnda etkili bir kullaným sergiliyor. Geniþ ekraný ile geliþmiþ bir görüntüleme alaný saðlayan Galaxy M11, oyun ve multimedya deneyimlerini iyileþtiriyor. Etkili kamera performansý sayesinde keyifli fotoðraflar yakalamanýza yardým eden ürün, bataryasý ile de gün boyu kullanýmý destekliyor.\r\n" + 
				"\r\n" + 
				"Estetik ve Þýk Kullaným Saðlayan Tasarým Detaylarý\r\n" + 
				"\r\n" + 
				"Sonsuz U ekran teknolojisi ile hazýrlanmýþ olan Samsung Galaxy M11, 6.4 inç geniþliðindeki ekraný ile keyifli bir telefon kullanýmý saðlýyor. PLS ekran teknolojisi ile geliþtirilmiþ olan ekraný, 720 x 1560 piksel çözünürlüðe sahip HD görüntü kalitesi sergiliyor. Multi Touch özelliðine sahip kapasitif ekraný, kolay ve pratik bir deneyim yaþamanýzý saðlýyor. Ýnce çerçeve tasarýmý ile hazýrlanmýþ olan ürün, %81.32 ekran gövde oranýyla da dikkat çekiyor. Oyun oynarken rahatlýk saðlayan geniþ ekraný, film ve dizi izlerken de tüm ayrýntýlara dikkat edebilmenize izin veriyor. Çizilmelere karþý dirençli cam olarak hazýrlanmýþ olan ön panelini plastik ve güçlü malzemeden imâl edilmiþ gövde destekliyor. Yan tarafýnda yer alan güç ve ses kontrol tuþlarý, telefona karizmatik ve etkili bir görünüm kazandýrýyor. Mor, siyah ve turkuaz renk seçenekleri ile sunulan ürün, her zevke hitap ediyor. Kavisli olarak tasarlanmýþ olan gövdesi, tek elle kullanýma uygun bir seçenek oluþturuyor. Telefonun arka panelinde, üçlü kamera detaylarý ve parmak izi okuyucusu yer alýyor. Ürünün görüntüsüne estetik bir dokunuþ yapan arka paneli, ýþýðý kýran yapýsý sayesinde estetik ve þýk bir telefon görünümünü mümkün kýlýyor.\r\n" + 
				"\r\n" + 
				"Samsung Galaxy M11 Özellikleri\r\n" + 
				"\r\n" + 
				"6.4 inç geniþliðinde hazýrlanmýþ olan HD+ ekraný, oyun ve multimedya deneyimlerinizi iyileþtiriyor. Etkili ve keyifli bir telefon kullanýmýný mümkün kýlan ekraný, 268 PPI piksel yoðunluðu ile baþarýlý bir görüntüleme özelliði sunuyor. Çerçevesiz tasarým özelliði sayesinde ekraný etkili bir þekilde kullanabilmenize yardým eden Galaxy M11, oyun içerisindeki ayrýntýlarý en net þekilde görebilmenize ve karanlýk ortama sahip filmleri bile keyifli bir þekilde izleyebilmenize izin veriyor.\r\n" + 
				"3 GB RAM desteðine sahip Samsung Galaxy M11, uygulama geçiþlerini ve çoklu görevleri sorunsuz bir þekilde gerçekleþtirebilmenize ortam hazýrlýyor. 14 nm CPU teknoloji ile hazýrlanmýþ ürün, yoðun güç gerektiren anlarda bile performansý koruyarak telefon kullanýmýnýzýn olumsuz etkilenmesini engelliyor.");
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
		detay.setAdres("Ankara Merkez kýzýlay caddesi");
		detay.setEmail("vektorel@gmail.com");
		detay.setFacebook("https://www.facebook.com");
		detay.setFirmaadi("E-Ticaret Sistemi A.Þ.");
		detay.setFirmalink("www.google.com");
		detay.setInstagram("");
		detay.setTelefon("0 555 666 11 22");
		detay.setTwitter("");
		
		siteDetayDao.Save(detay);		
	} 
}
