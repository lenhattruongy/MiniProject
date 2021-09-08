package com.Truongln_PC01048_MiniProject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Truongln_PC01048_MiniProject.DAO.AccountDAO;
import com.Truongln_PC01048_MiniProject.entity.Account;
import com.Truongln_PC01048_MiniProject.service.AccountService;

@Service
public class AccountServicelmpl implements AccountService{
	@Autowired
	AccountDAO adao;
	
	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return adao.findAll();
	}
	
	@Override
	public Account create(Account account) {
		return adao.save(account);
	}
}
