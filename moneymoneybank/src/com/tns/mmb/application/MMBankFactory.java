package com.tns.mmb.application;

import com.tns.mmb.framework.BankFactory;
import com.tns.mmb.framework.CurrentAcc;
import com.tns.mmb.framework.SavingAcc;

public class MMBankFactory extends BankFactory{


	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc MMSaving = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return MMSaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc MMCurrent = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return MMCurrent;
	}
}
