package com.svkp.client;

import com.svkp.bank.application.GcCurrentAcc;
import com.svkp.bank.application.GsSavingAcc;
import com.svkp.bank.application.Gsbankfactory;

public class Clint {

	
	public static void main(String[] args) {
		Gsbankfactory gsbankfac= new Gsbankfactory();
		gsbankfac.getNewSavingAccount(0, null, 0, false);
		gsbankfac.getNewCurrentAccount(123, "suraj", 23456, true);
		
		GsSavingAcc gssaving = new GsSavingAcc(125,"krishna",123454,true);
		gssaving.withdrow(12344);
		
		GcCurrentAcc gscurrent = new GcCurrentAcc(234,"ram",56478,true);
		gscurrent.diposit(123);
	}

}
