package com.mensah.mini_project_b3;

import classes.Bank;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Bank bank = new Bank("Ghana Commercial Bank");

        bank.addBranch("Market Circle");

        bank.addCustomer("George","Mensah", 50.05);
        bank.addCustomer("George","Ofosu", 175.34);
        bank.addCustomer("George","King", 220.12);

        bank.addCustomerTransaction("George","Mensah", 44.22);
        bank.addCustomerTransaction("George","Mensah", 12.44);
        bank.addCustomerTransaction("George","Ofosu", 1.65);

        bank.listCustomers("George", true);
        
    }
}
