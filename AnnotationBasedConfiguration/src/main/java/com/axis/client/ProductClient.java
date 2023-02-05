package com.axis.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.axis.service.ProductService;

public class ProductClient {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext();
		con.scan("com.axis");
		con.refresh();
		
		ProductService ps = (ProductService) con.getBean("productService");
		ps.productServiceLayer();
	}

}