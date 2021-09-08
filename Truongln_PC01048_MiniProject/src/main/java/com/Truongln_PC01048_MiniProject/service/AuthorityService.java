package com.Truongln_PC01048_MiniProject.service;

import java.util.List;

import com.Truongln_PC01048_MiniProject.entity.Authority;



public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);

}
