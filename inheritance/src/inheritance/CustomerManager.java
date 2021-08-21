package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	//bireyselde ve krumsalda customer extend edildigi i�in yani asl�nda bireysele ve kurumsala 
	//sen asl�nda bir customers�n dedik.//Classlar referans tiplidir
	//metoddaki customera eger individual verirsek individual // corp. verirsek corp �al�s�r
	//Customer class� "base" dir
	
	// yeni bir m��teri t�r� eklendi�inde add metodunda hi�bir de�i�iklik yapmam�z gerekmez
	//��nk� add i�ine inherit edilmi� base s�n�f Customer� veriyoruz
	//Customer� di�er class larda inherit edersek //customer class� base oldu�u i�in
	//customer t�r�n� ne verirsen ona g�re �al���r metodta de�i�iklik yap mak gerekmez
	
	//Bulk Insert //coklu veri girisi //**bkz. Polymorphism**
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
	
//	//overloading
//	public void add(IndividualCustomer individualCustomer) {
//		System.out.println(individualCustomer.customerNumber + " kaydedildi.");	
//	}
//	
//	public void add(CorporateCustomer corporateCustomer) {
//		System.out.println(corporateCustomer.customerNumber + " kaydedildi.");	
//	}


}
