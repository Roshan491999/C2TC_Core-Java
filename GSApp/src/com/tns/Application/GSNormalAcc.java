package com.tns.Application;

import com.tns.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
	public GSNormalAcc() {
		
	}

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public void bookProduct(float f) 
	{
	
	}

	@Override
	public String toString() {
		return "Dear Normal user [delivery charges are" + getDeliveryCharges() + ", Charges=" + getCharges()+ "]";
	}
	

	

}
