package com.Truongln_PC01048_MiniProject.service;

import java.util.List;

import com.Truongln_PC01048_MiniProject.entity.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	

}
