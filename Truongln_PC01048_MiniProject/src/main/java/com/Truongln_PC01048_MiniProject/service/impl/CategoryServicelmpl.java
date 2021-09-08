package com.Truongln_PC01048_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.Truongln_PC01048_MiniProject.DAO.CategoryDAO;
import com.Truongln_PC01048_MiniProject.entity.Category;
import com.Truongln_PC01048_MiniProject.service.CategoryService;

@Configuration
public class CategoryServicelmpl implements CategoryService {
	@Autowired
	CategoryDAO cdao;

	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}
}
