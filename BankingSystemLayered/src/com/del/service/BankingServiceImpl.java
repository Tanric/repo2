package com.del.service;
 
import com.del.dao.BankingDao;
import com.del.dao.BankingDaoImpl;
import com.del.exception.BankingException;
import com.del.util.Message;
 
public class BankingServiceImpl implements BankingService {
    private BankingDao bDao;
     
    public BankingServiceImpl() {
        bDao = new BankingDaoImpl();
    }
    @Override
    public void depositAmount(double amount) throws BankingException {
        if(amount<0) {
            throw new BankingException(Message.NEGATIVE_VALUE);
        }
        bDao.depositAmount(amount);
    }
    @Override
    public double getBalance() {
        return bDao.getBalance();
    }
    @Override
    public double getAmount(double amount) throws BankingException {
    	if(isAmountNegative(amount)) {
    		throw new BankingException(Message.NEGATIVE_VALUE);
    		
    	}
        return bDao.getAmount(amount);
    }
	private boolean isAmountNegative(double amount) throws BankingException {
		// TODO Auto-generated method stub
		if(amount<0) {
			throw new BankingException(Message.NEGATIVE_VALUE);
		}
		return false;
	}
	@Override
	public boolean authenticate(String login, String password) {
		
		// TODO Auto-generated method stub
		return bDao.authenticate(login,password);
	}
 
}