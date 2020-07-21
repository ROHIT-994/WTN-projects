package com.wipro.bank.service;
import com.wipro.bank.acc.RDAaccount;
import com.wipro.bank.Exception.BankValidationException;


public class BankService {
	public boolean validateData(float principal, int tenure, int age, String gender)
	{
		try
		{
			if(principal<500)
				throw new BankValidationException("principal amount not sufficient");
			if(!(tenure==5 || tenure==10))
				throw new BankValidationException("5 or 10 only");
			if(!(gender.equalsIgnoreCase("M")|| gender.equalsIgnoreCase("F")))
				throw new BankValidationException("only");
			if(age<1 || age>100)
				throw new BankValidationException("only 1 to 100");
		
			
				
		}catch(BankValidationException b)
		{
			return false;
		}
		return true;
	}
	 public void calculate(float principal,int tenure, int age, String gender)
	    {
	        boolean validateFlag=validateData(principal,tenure,age,gender);
	        System.out.println(validateFlag);
	        System.out.println(principal);
	        System.out.println(tenure);
	        System.out.println(age);
	        System.out.println("gender");
	                if(validateFlag)
	                {
	                    RDAaccount rda=new RDAaccount(tenure,principal);
	                    rda.setInterest(age, gender);
	                    float maturityIntrest=rda.calculateInterest();
	                    float totalPrincipleDeposited=rda.calculateAmountDeposited();
	                    System.out.println(maturityIntrest);
	                    System.out.println(totalPrincipleDeposited);
	                    System.out.println(rda.calculateMaturityAmount(totalPrincipleDeposited,maturityIntrest));
	                
	                    
	                    
	                }
	    }
}
