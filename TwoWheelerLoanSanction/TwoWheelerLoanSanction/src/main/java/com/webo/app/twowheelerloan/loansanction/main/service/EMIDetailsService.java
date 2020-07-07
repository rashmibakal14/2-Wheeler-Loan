package com.webo.app.twowheelerloan.loansanction.main.service;

import com.webo.app.twowheelerloan.loansanction.main.model.EMIDetails;

public interface EMIDetailsService {

	String saveData(EMIDetails ed);

	EMIDetails getDataById(int id);

}
