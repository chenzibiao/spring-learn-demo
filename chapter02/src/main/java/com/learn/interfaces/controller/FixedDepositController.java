package com.learn.interfaces.controller;


import com.learn.interfaces.domain.FixedDepositDetails;
import com.learn.interfaces.service.FixedDepositService;

public interface FixedDepositController {
	FixedDepositService getFixedDepositService();

	boolean submit();

	FixedDepositDetails get();
}
