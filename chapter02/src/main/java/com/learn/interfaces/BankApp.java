package com.learn.interfaces;

import com.learn.interfaces.controller.FixedDepositController;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BankApp {
	private static Logger logger = Logger.getLogger(BankApp.class);

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext-interfaces.xml");

		FixedDepositController fixedDepositController = (FixedDepositController) context
				.getBean("controller");

		logger.info("Submission status of fixed deposit : "
				+ fixedDepositController.submit());
		logger.info("Returned fixed deposit info : "
				+ fixedDepositController.get());
	}
}
