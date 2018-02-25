package com.app.demo.service;

import java.util.List;

import com.app.demo.domain.Client;

public interface ClientService {
	List<Client> findAll();
	Client saveClient(Client client);
	Client getClientById(Long id);
	void deleteClient(Long id);
}
