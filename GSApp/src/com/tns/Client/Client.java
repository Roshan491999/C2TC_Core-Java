package com.tns.Client;

import com.tns.Application.GSNormalAcc;
import com.tns.Application.GSPrimeAcc;
import com.tns.Application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(123, "vikas",1000 , true);
		gssfactory.getNewNormalAccount(111, "Roshan", 1000, 50);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(1000);
		
		gsprime.toString();
		
		
		GSNormalAcc gsnormal =new GSNormalAcc();
		 gsnormal.getAccNm();
		 gsnormal.getAccNo();
		 gsnormal.getCharges();
		 gsnormal.getDeliveryCharges();
		 
		 
		 gsnormal.bookProduct(1000);
		 
		 gsnormal.toString();
		
		
		
		

	}

}
