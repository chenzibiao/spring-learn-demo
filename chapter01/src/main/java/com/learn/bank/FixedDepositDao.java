package com.learn.bank;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

@SuppressWarnings("unused")
public class FixedDepositDao {
	private static Logger logger = Logger.getLogger(FixedDepositDao.class);
	private String url;
	private String driverClass;
	private String username;
	private String password;
	
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public static FixedDepositController xyz(String xyz) {
		System.out.println(xyz);
		return new FixedDepositController();
	}
	public FixedDepositDao() {
		logger.info("initializing");
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}
}
