package com.svkp.bank.application;

import com.svkp.framwork.CurrentAcc;

public class GcCurrentAcc  extends CurrentAcc{
	public GcCurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "GcCurrentAcc [diposit=" + diposit + ", accountbalance=" + accountbalance + ", accno=" + accno
				+ ", accname=" + accname + ", accBal=" + accBal + "]";
	}



	public void diposit (float charges) {
		System.out.println("Dear custmer your balance:" + "+accountbalance" + "diposit:" + diposit);
	}



}
