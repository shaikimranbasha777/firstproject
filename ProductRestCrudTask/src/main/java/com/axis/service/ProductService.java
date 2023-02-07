package com.axis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axis.entity.Product;

@Service
public interface ProductService {
	
	Product addProductToCart(Product product);
	List<Product> getAllProducts();
	Product getProductById(int id);
	Product updateProduct(int id, Product product);
	String deleteProduct(int id);
	List<Product> getProductByName(String productName);
	List<Product> getProductByDescription(String productDescription);
}
