package classes;

import java.util.ArrayList;

import interfaces.ICustomer;

public class Customer implements ICustomer{
	private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction){
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }
}
