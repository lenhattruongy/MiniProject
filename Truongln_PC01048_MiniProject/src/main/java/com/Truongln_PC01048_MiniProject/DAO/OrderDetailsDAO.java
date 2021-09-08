package com.Truongln_PC01048_MiniProject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Truongln_PC01048_MiniProject.entity.OrderDetail;



public interface OrderDetailsDAO extends JpaRepository<OrderDetail, Long> {

}
