package com.wipro.bank.acc;

public abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;
	public void setInterest(int age, String gender)
	{
		if(gender.equals("M"))
		{
			if(age<60)
				rateOfInterest=9.8f;
			else
				rateOfInterest=10.5f;
		}
		else if(gender.equals("F"))
		{
			if(age<58)
				rateOfInterest=10.2f;
			else
				rateOfInterest=10.8f;
		}
		System.out.println(rateOfInterest);
	}
	public float calculateMaturityAmount(float totalPrincipleDeposited,              
			float maturityInterest)
	{
		return totalPrincipleDeposited+maturityInterest;
	}
	public abstract float calculateInterest();
	public abstract float calculateAmountDeposited();




}