package pideci;
public class queue {
	NodePide front;//head Sıranın başını temsil eder.(Pideyi ilk alacak kişidir.)
	NodePide rear;//tail sıranın sonu (Yeni gelen kişi)
	int size;//Max kapasite
	int cnt;//Kuyruğa ekleme yapınca artırırız,çıkartma yaptıkça azaltırız. Şu an sırada kaç kişi olduğunu temsil edecektir.
	
	public queue(int size) {
		this.size = size;
		this.cnt=0;
		this.front= null;
		this.rear=null;
	}
	boolean isFull()//Kuyruk dolu mu boş mu kontrol ediyoruz.
	{return cnt==size;}
	boolean isEmpty() 
	{return cnt==0;}
	//Sıraya müşteri ekleme
	void enQueue(String isim,int adet) {
		if(isFull()) {
			System.out.println("Fırın önü çok kalabalık,kuyruk dolu!");
		}
		else 
		{NodePide eleman= new NodePide(isim,adet);
		if(isEmpty()) {
			front=eleman;
			rear=eleman;
		}
		else {
			//Son müşterinin arkasına yeni geleni bağla
			rear.next=eleman;
			//Yeni son artık bu elemandır.
			rear=eleman;
		}
		cnt++;
		System.out.println(isim+" sıraya girdi.(" +adet + " pide istiyor.)");
		}
	}
	//Sıradan müşteri çıkar.(deQueue)
	void deQueue() {
		if(isEmpty()) {
			System.out.println("Sırada kimse yok, fırın boş.");
		}
		else {
			System.out.println(front.isim +"pidesini aldı, sıradan çıkıyor. Ücret: "+front.ucret+"TL");
			//Sıranın başını bir sonraki kişiye kaydırır.
			front=front.next;
			//Eğer son eleman da çıktıysa rear'ı temizleriz.
			if(front==null) {
				rear=null;
			}
			cnt--;
		}
	}
}
