package com.axis.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer>{
	List<Product> findByProductName(String productName);
	List<Product> findByProductDescription(String productDescription);
}
