package com.svkp.bank.application;

import com.svkp.framwork.SavingAcc;

public class GsSavingAcc extends SavingAcc  {
	
	private static final float accountbalance = 0;


	public GsSavingAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		// TODO Auto-generated constructor stub
	}

	public void withdrow(float accBal) {
			System.out.println("Dear custamer,your Accoutbal"+ accountbalance);
		}
	    public void deposit(float accBal) {
	    	System.out.println("dear custamer,your acccoutbal"+ accountbalance);
	    }
		@Override
		public String toString() {
			return "GsSavingAcc [accno=" + accno + ", accname=" + accname + ", accBal=" + accBal + "]";
		}

}
