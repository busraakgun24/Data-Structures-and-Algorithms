package pideci;

public class Uygulama {
	public static void main(String[] args) {
		queue pideci=new queue(5);//5 kişilik kuyruk oluşturuldu.
		pideci.enQueue("Büşra", 3);
		pideci.enQueue("Ceren", 2);
		pideci.deQueue();//Büşra pidesini alır ve kuyruktan çıkar.
		pideci.deQueue();//Ceren pidesini alır ve kuyruktan çıkar.
	}
}
