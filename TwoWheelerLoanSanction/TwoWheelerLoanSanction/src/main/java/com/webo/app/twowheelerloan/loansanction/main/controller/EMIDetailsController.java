package com.webo.app.twowheelerloan.loansanction.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.loansanction.main.model.EMIDetails;
import com.webo.app.twowheelerloan.loansanction.main.service.EMIDetailsService;

@RestController
@CrossOrigin("*")
public class EMIDetailsController {

	@Autowired
	private EMIDetailsService service;
	
	@RequestMapping(value = "/emi")
	public String message() {
		return "EMI Details works!";
	}
	
	@PostMapping(value = "/added")
	public String addData(@RequestBody EMIDetails ed) {
		String saved = service.saveData(ed);
		return saved;
	}
	
	@GetMapping(value = "/geted/{id}")
	public EMIDetails getData(@PathVariable("id")int id) {
		EMIDetails ed = service.getDataById(id);
		return ed;
	}
}
