package com.tns.mmb.framework;

	public abstract class SavingAcc extends BankAcc {
		
	
		private boolean isSalaried;
		private static final float creditLimit = 000;
		
		public SavingAcc(int AccNo, String accNm, float AccBal, boolean isSalaried) {
			super(AccNo, accNm, creditLimit);
			this.isSalaried = isSalaried;
		}

		public void withdraw(float AccNo) {
			System.out.println("AccNo are: "+AccNo);
			
		}

		@Override
		public String toString() {
			return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		
	}
}
	