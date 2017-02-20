package Constructor;

class OtoGaleri{
	double motorHacmi;
	int aracKapiSayisi;
	String aracMarkasi;
	double aracFiyat;
	public OtoGaleri(){ // Default Constructor 
		motorHacmi = 1.4;
		aracFiyat = 60000;
		aracKapiSayisi = 5;
	    aracMarkasi = "Golf";
	}
	public OtoGaleri(double aracFiyat){ // Polymorphism - Overloading
		this(); // Default Constructor çağırıyoruz.
		this.aracFiyat = aracFiyat * 2; // Farazi bir sayıyla çarpıp, aracın vergilerle toplam ne kadara mâl olacağını hesaplıyorum.
		
	}
}
public class ConstuctorDenemeleri2 {
	public static void main(String[] args) {
		OtoGaleri vWGolf = new OtoGaleri();
		System.out.println("*** Standart Paket ***");
		System.out.println("Tanımlı araç: "+ vWGolf.aracMarkasi);
		System.out.println("Tanımlı aracın motor hacmi: "+ vWGolf.motorHacmi);
		System.out.println("Tanımlı aracın standart paket ücreti: "+ vWGolf.aracFiyat);
		System.out.println("Tanımlı aracın kapı sayısı: "+ vWGolf.aracKapiSayisi);
		System.out.println("*** ***");
		
		OtoGaleri vWPassat = new OtoGaleri();
		vWPassat.aracFiyat = 80000;
		vWPassat.aracKapiSayisi = 5;
		vWPassat.aracMarkasi = "Volkswagen Passat";
		vWPassat.motorHacmi = 2.0;
		System.out.println("*** Özel Paket ***");
		System.out.println("Tanımlı araç: "+ vWPassat.aracMarkasi);
		System.out.println("Tanımlı aracın motor hacmi: "+ vWPassat.motorHacmi);
		System.out.println("Tanımlı aracın standart paket ücreti: "+ vWPassat.aracFiyat);
		System.out.println("Tanımlı aracın kapı sayısı: "+ vWPassat.aracKapiSayisi);
		System.out.println("*** ***");	
		
		OtoGaleri vWPolo = new OtoGaleri(40000);
		vWPolo.aracMarkasi = "Volkswagen Polo";
		System.out.println("Tanımlı araç: "+ vWPolo.aracMarkasi);
		System.out.println("Tanımlı aracın çıkış fiyatı: "+ vWPolo.aracFiyat);
	}
}
