package com.app.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.demo.domain.Client;
import com.app.demo.service.ClientService;


@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "/client")
	public String client(Map<String, Object> model) {
		List<Client> clientList = clientService.findAll();
		model.put("clientList", clientList);
		return "client";
	}

	@RequestMapping("client/new")
	public String newProduct(Model model) {
		model.addAttribute("client", new Client());
		return "clientForm";
	}

	@RequestMapping(value = "client", method = RequestMethod.POST)
	public String saveProduct(Client client) {
		clientService.saveClient(client);
		return "redirect:/client";
	}

	@RequestMapping("client/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("client", clientService.getClientById(id));
		return "clientForm";
	}

	@RequestMapping("client/delete/{id}")
	public String delete(@PathVariable Long id) {
		clientService.deleteClient(id);
		return "redirect:/client";
	}


}
