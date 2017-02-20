package Constructor;

class Sirket{
	String adSoyad;
	String pozisyonBilgisi;
	int yasBilgisi;
	int maasBilgisi;
	public Sirket(){
		// Default Constructor
		System.out.println("Şirketimizde yeni bir çalışan oluşturuldu.");
		adSoyad = "Bilinmiyor";
		pozisyonBilgisi = "Hangi pozisyonda çalıştığı bilgisi, sisteme girilmedi.";
		yasBilgisi = 18;
		maasBilgisi = 1300;
	}
	public Sirket(String adSoyad, String pozisyonBilgisi, int yasBilgisi, int maasBilgisi){
		//Polymorphism - Overloading
		this(); // Default Constructor çağırma
		this.adSoyad = adSoyad;
		this.pozisyonBilgisi = pozisyonBilgisi;
		this.yasBilgisi = yasBilgisi;
		this.maasBilgisi = maasBilgisi;
	}
}

public class ConstructorDenemeleri {
	public static void main(String[] args) {
		Sirket sekreter = new Sirket("Yusuf Atmaca", "Sekreter", 25, 2500); // Obje oluşturuyoruz.
		System.out.println(sekreter.pozisyonBilgisi + " pozisyonunda çalışan, " + sekreter.adSoyad + " kimlikli personelin yaşı: " + sekreter.yasBilgisi + "; maaşı: "+sekreter.maasBilgisi);
		Sirket ceo = new Sirket();
		ceo.adSoyad = "Caner Eler";
		System.out.println(ceo.pozisyonBilgisi + " pozisyonunda çalışan, " + ceo.adSoyad + " kimlikli personelin yaşı: " + ceo.yasBilgisi + "; maaşı: "+ceo.maasBilgisi);
	}
}
