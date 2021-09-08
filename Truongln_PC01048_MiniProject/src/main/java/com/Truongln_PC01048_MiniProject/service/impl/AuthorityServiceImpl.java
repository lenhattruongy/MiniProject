package com.Truongln_PC01048_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Truongln_PC01048_MiniProject.DAO.AccountDAO;
import com.Truongln_PC01048_MiniProject.DAO.AuthorityDAO;
import com.Truongln_PC01048_MiniProject.entity.Account;
import com.Truongln_PC01048_MiniProject.entity.Authority;
import com.Truongln_PC01048_MiniProject.service.AuthorityService;



@Service
public class AuthorityServiceImpl implements AuthorityService{
	
	@Autowired
	AuthorityDAO dao;
	
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		return dao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

}
