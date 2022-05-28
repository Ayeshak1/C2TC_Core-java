package com.tns.mmb.application;

import com.tns.mmb.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
		
		public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
			super(accNo, accNm, accBal, isSalaried);
		}

		

		public void withdraw(float accNo) {
			System.out.println("Dear current User, Your AccBal are: "+accBal+" with account number is: "+accNo);
		}

		@Override
		public String toString() {
			return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}

		

		

	}


