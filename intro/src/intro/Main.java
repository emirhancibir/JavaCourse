package intro;


public class Main {

	public static void main(String[] args) {
		
		//camelCase
		String internetSubebutonu = "buton";
		System.out.println(internetSubebutonu);
		double dolarDun = 8.25;
		double dolarBugun = 8.25;
		
		if (dolarBugun<dolarDun) 
		{
			System.out.println("Dolar Dustu");
		}
		
		else if(dolarBugun==dolarDun) 
		{
			System.out.println("Dolar Esit");
		}
		
		else 
		{
			System.out.println("Dolar Arttý");
		}
		
		String kredi1 = "Ciftci Kredisi";
		String kredi2 = "Emekli Kredisi";
		String kredi3 = "Genc Kredisi";
		String kredi4 = "Memur Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		
		String[] krediler = {
				"Ciftci Kredisi",
				"Emekli Kredisi",
				"Genc Kredisi",
				"Memur Kredisi"
		};
		//diziyi dolaþma //  foreach dongusu
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		for(int i =0; i<krediler.length;i++) {
			System.out.println(krediler[i]); //indexle çaðýrma //zero based
		}
		//deger tip //value type degeri tutar
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2=100;
		System.out.println(sayi1); //20 
		//reference type, adresini tutar 
		int[] sayilar1= {1,2,3,4};
		int[] sayilar2= {10,20,30,40};
		sayilar1 = sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]); //100 //adresi(yolu) tuttugu icin
		
	
	
	
	
	
	}

}
