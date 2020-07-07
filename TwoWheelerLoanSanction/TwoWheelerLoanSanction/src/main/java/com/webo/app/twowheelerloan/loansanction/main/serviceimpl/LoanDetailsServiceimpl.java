package com.webo.app.twowheelerloan.loansanction.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.loansanction.main.model.LoanDetails;
import com.webo.app.twowheelerloan.loansanction.main.repository.LoanDetailsRepository;
import com.webo.app.twowheelerloan.loansanction.main.service.LoanDetailsService;

@Service
public class LoanDetailsServiceimpl implements LoanDetailsService {
	
	@Autowired
	private LoanDetailsRepository ldrepo;

	@Override
	public String savedata(LoanDetails ld) {
		String saved = "";
		if(ldrepo.save(ld) != null) {
			saved = "Data saved";
		}else {
			saved = "Data is not saved";
		}
		return saved;
	}

	@Override
	public LoanDetails getDataById(int id) {
		return ldrepo.findById(id).get();
	}

	@Override
	public Iterable<LoanDetails> getAllData() {

		return ldrepo.findAll();
	}

	@Override
	public Iterable<LoanDetails> addalldata(Iterable<LoanDetails> list) {
		
		return ldrepo.saveAll(list);
	}

}
