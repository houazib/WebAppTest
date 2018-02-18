package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.domain.Account;
import com.app.demo.domain.Client;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
