package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Product;
import com.axis.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	ResponseEntity<Product> addproductInCart(@RequestBody Product product){
		return new ResponseEntity<Product>(productService.addProductToCart(product), HttpStatus.OK);
	}
	
	@GetMapping("/product")
	ResponseEntity<List<Product>> getAllProduct(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	ResponseEntity<Product> getProductById(@PathVariable int id){
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatus.OK);
	}
	
	@PutMapping("/product/{id}")
	ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
		return new ResponseEntity<Product>(productService.updateProduct(id, product), HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{id}")
	ResponseEntity<String> addproductInCart(@PathVariable int id){
		return new ResponseEntity<String>(productService.deleteProduct(id), HttpStatus.OK);
	}
	
	@GetMapping("/productbyname/{productName}")
	ResponseEntity<List<Product>> getProductByName(@PathVariable String productName){
		return new ResponseEntity<List<Product>>(productService.getProductByName(productName), HttpStatus.OK);
	}
	
	@GetMapping("/productbydescription/{productDescription}")
	ResponseEntity<List<Product>> getProductByDescription(@PathVariable String productDescription){
		return new ResponseEntity<List<Product>>(productService.getProductByDescription(productDescription), HttpStatus.OK);
	}
}










