package com.app.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgencyController {
	
	
	@RequestMapping(value="/agency")
	public String agency(Map<String, Object> model) {
		model.put("", "");
		return "agency";
	}

}
