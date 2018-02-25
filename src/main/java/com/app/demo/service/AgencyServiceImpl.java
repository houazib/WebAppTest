package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.domain.Agency;
import com.app.demo.repository.AgencyRepository;

@Service
public class AgencyServiceImpl implements AgencyService {
	
	@Autowired
	private AgencyRepository agencyRepository;

	@Override
	public List<Agency> findAll() {
		return agencyRepository.findAll();
	}

	@Override
	public Agency saveAgency(Agency agency) {
		return agencyRepository.save(agency);
		
	}

	@Override
	public Agency getAgencyById(Long id) {
		return agencyRepository.findOne(id);
	}

	@Override
	public void deleteAgency(Long id) {
		agencyRepository.delete(id);
		
	}
	
	
	
}
