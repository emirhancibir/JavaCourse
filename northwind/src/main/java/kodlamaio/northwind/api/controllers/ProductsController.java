package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	/*
	 * @PostMapping veri gönderiyoruz demek GetMapping veri istiyoruz demek
	 * 
	 * @RequestBody verdiğimiz datalar ile Product nesnesinin özellikleriyle
	 * eşleştiriyor kısaca arka planda bir Product nesnesi oluşturuyor.
	 * 
	 * @RestController androidde başka dillerde vs çalışacaksın demek REST ->
	 * REpresentational State Transfer (temsili durum transferi)
	 * 
	 * @Autowired bu anotasyonda product serviice i implemente eden classları
	 * kendisi newler bizim newlememize gerek kalmaz
	 */
}
