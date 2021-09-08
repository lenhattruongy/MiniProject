package com.Truongln_PC01048_MiniProject.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Truongln_PC01048_MiniProject.entity.Order;
import com.Truongln_PC01048_MiniProject.entity.Product;
import com.Truongln_PC01048_MiniProject.service.OrderService;
import com.Truongln_PC01048_MiniProject.service.ProductService;
import com.fasterxml.jackson.databind.JsonNode;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {
	@Autowired 
	OrderService orderService;
	
	@PostMapping()
	public Order create(@RequestBody JsonNode orderData) {
		return orderService.create(orderData);
	}
}
