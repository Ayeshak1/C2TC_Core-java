package com.tns.mmb.framework;

public class BankAcc {
	
	
	
	
		private int accNo;
		private String accNm;
		protected float accBal;
		
		public int getAccNo() {
			return accNo;
		}

		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}

		public String getAccNm() {
			return accNm;
		}

		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}

		public float accBal() {
			return accBal;
		}

		public void setaccBal(float accBal) {
			this.accBal = accBal;
		}

		public BankAcc(int accNo, String accNm, float accBal) {
			super();
			this.accNo = accNo;
			this.accNm = accNm;
			this.accBal = accBal;
		}

		public void withdraw(float AccNo) {
			System.out.println(" accno are:"+AccNo);
		}
		
		public void deposite(float AccNo)
		{
			System.out.println("Items are deposite with AccNo :"+AccNo);
		}

		@Override
		public String toString() {
			return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		
		

	
}
