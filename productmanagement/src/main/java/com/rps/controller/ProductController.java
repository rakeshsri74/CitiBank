package com.rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rps.model.Product;
import com.rps.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<Object> getProduct(){
		return new ResponseEntity<Object>(productService.getProducts(),
				HttpStatus.OK);
	}
	
	@PostMapping("/products")
	public ResponseEntity<Object> createProduct(@RequestBody Product product){
		productService.createProduct(product);
		return new ResponseEntity<Object>("Product is created",HttpStatus.CREATED);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id,@RequestBody Product product){
		
		
		productService.updateProduct(id, product);
		return new ResponseEntity<Object>("Product is updated",
				HttpStatus.OK);
		
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable String id){
		productService.deleteProduct(id);
		return new ResponseEntity<Object>("Product is deleted",
				HttpStatus.OK);
		
	}
}
