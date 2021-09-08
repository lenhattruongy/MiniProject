package com.Truongln_PC01048_MiniProject.service;

import java.util.List;

import com.Truongln_PC01048_MiniProject.entity.Account;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	public Account create(Account account);
}
