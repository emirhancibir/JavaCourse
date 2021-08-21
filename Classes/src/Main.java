
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		//value and reference types
		
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		
		sayi2 = sayi1; //sayi2 = 10 olur deger tip oldugu icin stackte degeriyle birlikte tutulur
		sayi1 = 30;
		System.out.println(sayi2);
		
		//reference type
		
		int[] sayilar = new int[] {1,2,3,};
		int[] sayilar2 = new int[] {4,5,6};
		
		sayilar2 = sayilar; //sayilar2[0] => 35 // sayilar[0] => 35 stackte referans numarası tutar
		//degeri heap kısmında referansla eşleserek bulur = dedigimizde referans numaralarını esitlemis oluyoruz
		sayilar[0] = 35;
		
		System.out.println(sayilar2[0]);
		
	}

}
