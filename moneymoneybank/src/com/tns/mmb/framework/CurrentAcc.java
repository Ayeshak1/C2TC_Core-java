package com.tns.mmb.framework;


	public abstract class CurrentAcc extends BankAcc{
		private final float creditLimit;
		
		public float getcreditLimit() {
			return creditLimit;
		}
		
		public CurrentAcc(int accNo, String accNm, float AccNo, float isSalaried) {
			super(accNo, accNm, AccNo);
			this.creditLimit = isSalaried;
		}

		public void isSalary(float creditLimit)
		{
			System.out.println("AccNo are:"+creditLimit);
		}
		@Override
		public String toString() {
			return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + "]";
		}
		

		
	}

	
	
