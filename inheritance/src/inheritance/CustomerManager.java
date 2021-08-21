package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	//bireyselde ve krumsalda customer extend edildigi için yani aslýnda bireysele ve kurumsala 
	//sen aslýnda bir customersýn dedik.//Classlar referans tiplidir
	//metoddaki customera eger individual verirsek individual // corp. verirsek corp çalýsýr
	//Customer classý "base" dir
	
	// yeni bir müþteri türü eklendiðinde add metodunda hiçbir deðiþiklik yapmamýz gerekmez
	//Çünkü add içine inherit edilmiþ base sýnýf Customerý veriyoruz
	//Customerý diðer class larda inherit edersek //customer classý base olduðu için
	//customer türünü ne verirsen ona göre çalýþýr metodta deðiþiklik yap mak gerekmez
	
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
