package com.app.demo.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Agency {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String name;
	
	private String address;
	
	@OneToMany
	private Set<Client> clients = new HashSet<>();

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	

}
