package com.Truongln_PC01048_MiniProject.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Truongln_PC01048_MiniProject.entity.Account;
import com.Truongln_PC01048_MiniProject.entity.Authority;



public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
	
	@Query("SELECT DISTINCT a FROM Authority a WHERE a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);

}
