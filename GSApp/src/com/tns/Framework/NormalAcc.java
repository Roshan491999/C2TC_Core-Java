package com.tns.Framework;

public class NormalAcc extends ShopAcc {
	
private final float deliveryCharges=40;
        public NormalAcc() {
        	
        }


	
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges )
	{
		super(accNo, accNm, charges);
	}
	
    
	
	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float f) 
	{
	
	}
	

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}

}
