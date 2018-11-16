package com.learn.interfaces.service;


import com.learn.interfaces.dao.FixedDepositDao;
import com.learn.interfaces.domain.FixedDepositDetails;

public interface FixedDepositService {
	FixedDepositDao getFixedDepositDao();

	FixedDepositDetails getFixedDepositDetails(long id);

	boolean createFixedDeposit(FixedDepositDetails fdd);

}
