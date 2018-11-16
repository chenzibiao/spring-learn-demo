package com.learn.interfaces.dao;


import com.learn.interfaces.domain.FixedDepositDetails;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class FixedDepositHibernateDao implements FixedDepositDao{
	private static Logger logger = Logger.getLogger(FixedDepositHibernateDao.class);
	
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public FixedDepositHibernateDao() {
		logger.info("initializing");
	}

	@Override
	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

	@Override
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
}
