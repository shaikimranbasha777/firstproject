package com.axis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	Product findByProductName(String productName);
	List<Product> findByCategory(String category);
	List<Product> findByProductPriceLessThen(int productPrice);
	List<Product> findByProductPriceGreaterThen(int productPrice);
}
