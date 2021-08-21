package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstarcts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product, String message) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategori urun kabul etmiyor");
			return;
		}
		this.productDao.add(product);
		this.loggerService.logToSys(message);
		
		// bu kod hibernate ye s�k� ba��ml�
//		ProductDao productDao = new HibernateProductDao();
//		productDao.add(product);

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
