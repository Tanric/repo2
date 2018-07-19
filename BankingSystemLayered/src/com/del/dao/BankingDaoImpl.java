package com.del.dao;
 
import com.del.exception.BankingException;
import com.del.util.Message;
 
public class BankingDaoImpl implements BankingDao {
	private String login="tanmay";
	private String password="1234";
    private double balance;
    private double minBalance=1000;
    @Override
    public void depositAmount(double amount) {
        balance += amount;      
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public double getAmount(double amount) throws BankingException {
        double bal = balance - amount;
        if(bal<minBalance) {
            throw new BankingException(Message.LOW_BALANCE);
        }
        else {
            balance = bal;
        }
        return amount;
    }
	@Override
	public boolean authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return this.login.equals(login)&&this.password.equals(password);
	}
 
}