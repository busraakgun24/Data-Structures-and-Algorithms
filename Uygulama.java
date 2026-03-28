package faktoriyel;
import java.util.Random;// Rastgele sayı üretmek için gerekli kütüphane
public class Uygulama {
	public static void main(String[] args) 
	{
		agac hesap_agaci = new agac();
        Random rnd = new Random();
    // 1. Rastgele kaç tane sayı üretileceğini belirleyelim (Örn: 5 ile 15 arası)
    int adet = rnd.nextInt(11) + 5; 
    System.out.println("---Faktöriyelli Rastgele Ağaç Sistemi---");
    System.out.println("Sisteme toplam " + adet + " adet rastgele sayı eklenecek.\n");
    // 2. Belirlenen adet kadar rastgele sayı üretip ağaca ekleyelim
    for (int i = 0; i < adet; i++) {
        // 1 ile 10 arası rastgele sayılar (Faktöriyel çok büyümesin diye 10 sınırı koyduk)
        int rastgeleSayi = rnd.nextInt(10) + 1; 
        hesap_agaci.ekle(rastgeleSayi);
    }
    // 3. Sonuçları listeleyelim. (Ağaç yapısı sayesinde küçükten büyüğe sıralı gelecek)
    System.out.println("Sıralı Liste ve Faktöriyel Sonuçları:");
    hesap_agaci.listele(hesap_agaci.root);
    System.out.println("\n---İşlem Başarıyla Tamamlandı---");
	}
}
