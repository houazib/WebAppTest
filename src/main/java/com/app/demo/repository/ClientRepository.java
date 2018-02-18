package com.app.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.app.demo.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
