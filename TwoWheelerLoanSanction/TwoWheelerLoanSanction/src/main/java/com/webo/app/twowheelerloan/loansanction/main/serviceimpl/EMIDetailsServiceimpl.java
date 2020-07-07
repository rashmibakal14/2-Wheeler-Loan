package com.webo.app.twowheelerloan.loansanction.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loansanction.main.model.EMIDetails;
import com.webo.app.twowheelerloan.loansanction.main.repository.EMIDetailsRepository;
import com.webo.app.twowheelerloan.loansanction.main.service.EMIDetailsService;

@Service
public class EMIDetailsServiceimpl implements EMIDetailsService {
	
	@Autowired
	private EMIDetailsRepository repo;

	@Override
	public String saveData(EMIDetails ed) {
//		String saved = "";
//		if(repo.save(ed) != null) {
//			saved = "Data saved";
//		} else {
//			saved = "Data is not saved";
//		}
		return ((repo.save(ed) != null) ? "Data Saved" : "Data is not saved");
	}

	@Override
	public EMIDetails getDataById(int id) {
		return repo.findById(id).get();
	}

}
