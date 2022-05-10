package com.Application;
// this is Super class 
public abstract class ShopAcc  // this is Super class
{
	
	private int accNo;
	private String accNm;
	private float charges;
	
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
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public ShopAcc()
	{
		
	}
	
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float f) 
	{
		
		
	}
	public void items(float f)
	{
		
	}
	@Override
	public String toString() 
	{
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
}


class PrimeAcc extends ShopAcc  //subclass extends superclass
{
	

	private boolean isPrime;
	static private final  float deliveryCharges=0;
	
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		
	}
    
	
	public PrimeAcc(boolean isPrime)
	{
		
		this.isPrime = isPrime;
	}


	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float f) 
	{
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + "]";
	}
	
	
	
	
}


class NormalAcc extends ShopAcc   //subclass extends superclass
{
	
	

	private final float deliveryCharges=0;
	
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges ) {
		
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

