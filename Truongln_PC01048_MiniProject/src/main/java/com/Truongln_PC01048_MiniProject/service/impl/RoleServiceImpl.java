package com.Truongln_PC01048_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Truongln_PC01048_MiniProject.DAO.RoleDAO;
import com.Truongln_PC01048_MiniProject.entity.Role;
import com.Truongln_PC01048_MiniProject.service.RoleService;



@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDAO dao;

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

}
