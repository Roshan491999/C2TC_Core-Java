package com.tns.Application;

import com.tns.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	final private float Charges=0;
	
	public GSPrimeAcc() {
		// TODO Auto-generated constructor stub
	}

	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void bookProduct(float f) 
	{
		
	}
	
	
	


	public float getCharges() {
		return Charges;
	}


	@Override
	public String toString() {
		return "Dear prime useryour [Charges are=" + getCharges() + " ]";
	}


	

	
	}


	


