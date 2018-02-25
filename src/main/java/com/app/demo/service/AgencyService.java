package com.app.demo.service;

import java.util.List;

import com.app.demo.domain.Agency;


public interface AgencyService {
	List<Agency> findAll();
	Agency saveAgency(Agency agency);
	Agency getAgencyById(Long id);
	void deleteAgency(Long id);
}
