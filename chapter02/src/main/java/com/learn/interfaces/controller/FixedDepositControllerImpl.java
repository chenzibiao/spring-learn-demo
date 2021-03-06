package com.learn.interfaces.controller;

import com.learn.interfaces.domain.FixedDepositDetails;
import com.learn.interfaces.service.FixedDepositService;
import org.apache.log4j.Logger;



public class FixedDepositControllerImpl implements FixedDepositController {
	private static Logger logger = Logger.getLogger(FixedDepositControllerImpl.class);
	
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}

	@Override
	public FixedDepositService getFixedDepositService() {
		return fixedDepositService;
	}
	
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}

	@Override
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(
				1, 10000, 365, "someemail@something.com"));
	}

	@Override
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
