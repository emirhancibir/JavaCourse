package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer abuzer = new IndividualCustomer();
		abuzer.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		SyndicateCustomer syndicateCustomer = new SyndicateCustomer();
		syndicateCustomer.customerNumber = "99999";

		Customer[] customers1 = {abuzer,hepsiBurada,syndicateCustomer};
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(customers1);
		
//		customerManager.add(abuzer);
//		customerManager.add(hepsiBurada);
//		customerManager.add(syndicateCustomer);

// 		Customer customer = new Customer();
//		customer.id = 1;
//		customer.firstName = "Abuzer";
//		customer.lastName = "Komurcu";
//		customer.nationalIdentitiy = "10000000";
//		customer.customerNumber = "123";
// 		classlarr referans tiplidir
	}

}
