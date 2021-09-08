package com.Truongln_PC01048_MiniProject.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Truongln_PC01048_MiniProject.entity.Category;
import com.Truongln_PC01048_MiniProject.entity.Product;
import com.Truongln_PC01048_MiniProject.service.CategoryService;
import com.Truongln_PC01048_MiniProject.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categories")
public class CategoryRestController {
	@Autowired
	CategoryService categoryService;
	
	@GetMapping()
	public List<Category> getAll() {
		return categoryService.findAll();
	}
	
}
