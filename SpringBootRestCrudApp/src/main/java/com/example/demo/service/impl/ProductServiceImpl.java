package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
		@Autowired
		private ProductRepository repo;
	@Override
	public Integer saveProduct(Product p) {
		var cost = p.getProdCost();
		var gst = cost*12.0/100;
		p.setProdGst(gst);
		
		p=repo.save(p);
		return p.getProdId();
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> list =repo.findAll();

		return list;
	}

	@Override
	public Integer getOneProduct(Integer id) {
		Optional<Product> opt = repo.findById(id);
		if(opt.isPresent())
		{
			Product p = opt.get();
		}
		
		return null;
	}




}
