package com.tns.mmb.application;

import com.tns.mmb.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	private static final float accBal =10;

		public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
		
		

		public void withdraw(float accBal) {
			System.out.println("Dear current user , Your  accbal are: "+accBal);
		}

		@Override
		public String toString() {
			return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}

		
		
		
	}


