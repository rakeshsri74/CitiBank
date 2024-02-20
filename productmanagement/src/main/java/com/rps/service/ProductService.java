package com.rps.service;

import java.util.Collection;

import com.rps.model.Product;

public interface ProductService {

	public void createProduct(Product product);
	public Collection<Product> getProducts();
	public void updateProduct(String id,Product product);
	public void deleteProduct(String id);
}
