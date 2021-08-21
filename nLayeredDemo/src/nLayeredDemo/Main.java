package nLayeredDemo;

import nLayeredDemo.business.abstarcts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService service = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1, 2, "Camasir makinesi", 14000, 50);
		
		service.add(product, "logged to system");

	}

}
