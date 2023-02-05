package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Product;
import com.axis.exception.IdNotFoundException;
import com.axis.repository.ProductRepository;

@Service
public class ProductServiceImple implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProductToCart(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> pro = productRepository.findById(id);
		if(pro.isPresent()) {
			return pro.get();
		}else {
			throw new IdNotFoundException("Id Not Found in database to get details");
		}
		
		
	}

	@Override
	public Product updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		Optional<Product> pro = productRepository.findById(id);
		if(pro.isPresent()) {
			return productRepository.save(product);
		}else {
			throw new IdNotFoundException("Id Not Found in database to update");
		}
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		Optional<Product> pro = productRepository.findById(id);
		if(pro.isPresent()) {
			productRepository.deleteById(id);
			return "Product deleted";
		}else {
			throw new IdNotFoundException("Id Not Found in database to delete");
		}
		
	}

}
