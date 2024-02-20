package com.rps.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rps.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private static Map<String,Product> productRepo = new HashMap<>();
	
	static {
		Product honey = new Product("A001","Honey");
		Product almonds = new Product("A002","Almonds");
		productRepo.put(honey.getId(),honey);
		productRepo.put(almonds.getId(),almonds);
	}
	
	@Override
	public void createProduct(Product product) {
		productRepo.put(product.getId(), product);
	}

	@Override
	public Collection<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepo.values();
	}

	@Override
	public void updateProduct(String id, Product product) {
		productRepo.remove(id);
		product.setId(id);
		productRepo.put(id, product);
	}

	@Override
	public void deleteProduct(String id) {
		productRepo.remove(id);

	}

}
