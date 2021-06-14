package com.mensah.mini_project_b3;


import org.junit.Test;

import classes.Customer;
import junit.framework.TestCase;

public class CustomerClassTest extends TestCase {
	
	@Test
	public void TransactionIsGood(){
		Customer cust1 = new Customer("King George", 89.9);
		cust1.addTransaction(23.5);
		assertEquals("Transactions are up to date", 100, cust1.getTransactions() );
	}
	
}
