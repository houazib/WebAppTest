package com.app.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.demo.domain.Agency;
import com.app.demo.service.AgencyService;

@Controller
public class AgencyController {

	@Autowired
	private AgencyService agencyService;

	@RequestMapping(value = "/agency")
	public String agency(Map<String, Object> model) {
		List<Agency> agencyList = agencyService.findAll();
		model.put("agencyList", agencyList);
		return "agency";
	}

	@RequestMapping("agency/new")
	public String newProduct(Model model) {
		model.addAttribute("agency", new Agency());
		return "agencyForm";
	}

	@RequestMapping(value = "agency", method = RequestMethod.POST)
	public String saveProduct(Agency agency) {
		agencyService.saveAgency(agency);
		return "redirect:/agency";
	}

	@RequestMapping("agency/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("agency", agencyService.getAgencyById(id));
		return "agencyForm";
	}

	@RequestMapping("agency/delete/{id}")
	public String delete(@PathVariable Long id) {
		agencyService.deleteAgency(id);
		return "redirect:/agency";
	}

}
