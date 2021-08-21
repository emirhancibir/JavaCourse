package gun_2;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("Lenovo", 1, "16 gb ram", 16000, 10);
		// referans oluþturma yani class i cagirma gibi

		Product product2 = new Product(); // referans oluþturma yani class i cagirma gibi
		product2.setId(2);
		product2.setDetails("i5 iþlemci");
		product2.setName("Lenovo v15");
		product2.setDiscount(10);
		product2.setUnitPrice(14000);

		System.out.println(product2.getUnitPriceAfterDiscount());

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		//category1.id = 1;
		//category1.name = "Yiyecek";

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ýcecek");
		//category2.id = 2;
		//category2.name = "Ýcecek";

		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		//--------------------------------------
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product2);
		productManager.addToCart(product1);
		//mesela yonetim tum Categrory isimlerinin sonuna unlem koy dedi
		//Category class ýna gidip getName bloguna unlem ekleyecegiz
		/*
		 * //product 2 ve 3 imzasi parametresiz olan Product() blogunda callistigi icin
		 * calisti yazar. imzasi tutan bloga girer . product 1 de ise imzasi parametreli
		 * olan product cstoru calistigi icin blogun icindekiler calisir. Product
		 * product3 = new Product(); //referans oluþturma yani class i cagirma gibi
		 * product3.name = "Lenovo y5"; product3.id = 3; product3.details = "i3 6700k";
		 * 
		 * Product[] products = {product1,product2,product3};//arraye eleman ekleme
		 * 
		 * //System.out.println(products.length); for (Product product : products) {
		 * System.out.println(product.id); System.out.println(product.name);
		 * System.out.println("------------------");
		 * 
		 * }
		 * 
		 * Category category1 = new Category(); category1.id = 11; category1.name =
		 * "Elektronik";
		 * 
		 * Category category2 = new Category(); category2.id = 12; category2.name =
		 * "Ev / Bahce";
		 * 
		 * ProductManager productManager = new ProductManager(); // veri tipi //takma
		 * isim //cstoru çalýþtýrmak icin
		 * 
		 * 
		 * productManager.addToCart(product1);
		 * 
		 * productManager.addToCart(product2);
		 * 
		 * productManager.addToCart(product3);
		 */

	}

}
