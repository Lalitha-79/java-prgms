package com.svkp.bank.application;

import com.svkp.framwork.BankFactory;
import com.svkp.framwork.CurrentAcc;
import com.svkp.framwork.SavingAcc;

public class Gsbankfactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal, boolean withdraw) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal, boolean deposit) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
