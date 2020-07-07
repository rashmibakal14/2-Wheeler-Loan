package com.webo.app.twowheelerloan.loansanction.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.loansanction.main.model.EMIDetails;

@Repository
public interface EMIDetailsRepository extends JpaRepository<EMIDetails, Integer> {

}
