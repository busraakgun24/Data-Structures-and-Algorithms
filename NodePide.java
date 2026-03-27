package pideci;
/**
 * NodePide sınıfı: Kuyruktaki her bir müştreriyi temsil eden düğüm-node-obje-nesne yapısı.
 */
public class NodePide {
    //Müşteri bilgileri
	String isim;// Müşterinin ismini tutacak olan metin değişkenidir.
	int adet;// Pide sayısını tutacak tam sayı- integer türü değişkendir.
	int ucret;//Pidenin fiyatını temsil eden tam sayı değişkendir.
	
	//Kuyruktaki bir sonraki müşteriyi gösteren işaretçi, pointer (C++)
	NodePide next;
	
	//Kurucu Metot-Constructor Parametrelere ilk değer verir. Program çalıştığında tek sefer çalışır.
	public NodePide(String isim, int adet) {
		this.isim = isim;
		this.adet = adet;
		
		this.ucret=adet*30;//Pide fiyatı 30 Tl olarak hesaplanıyor.
		
		//Yeni oluşturulan bir düğüm başlangıçta kimseyi göstermez.
		this.next=null;//Yeni bir müşteri geldiğinde arkasında kimse yoktur.
	}
}
