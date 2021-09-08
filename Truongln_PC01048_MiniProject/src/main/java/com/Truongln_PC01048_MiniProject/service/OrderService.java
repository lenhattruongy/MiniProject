package com.Truongln_PC01048_MiniProject.service;

import java.util.List;

import com.Truongln_PC01048_MiniProject.entity.Order;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {

	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);



}
