package com.Truongln_PC01048_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Truongln_PC01048_MiniProject.DAO.ProductDAO;
import com.Truongln_PC01048_MiniProject.entity.Product;
import com.Truongln_PC01048_MiniProject.service.ProductService;

@Service
public class ProductServicelmpl implements ProductService {
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		pdao.deleteById(id);
	}
}
