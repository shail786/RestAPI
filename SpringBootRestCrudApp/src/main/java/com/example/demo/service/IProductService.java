package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface IProductService {
	
	Integer saveProduct(Product p);
	List<Product>getAllProducts();
	Integer getOneProduct(Integer id);
	
}
