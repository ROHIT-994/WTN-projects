package com.wipro.bank.main;
import com.wipro.bank.service.BankService;

public class Main {
	public static void main(String a[])
	{
	                int tenure = 10;
	                float principal = 1000;
	                int age = 23;
	                String gender = "M";
	                BankService b=new BankService();
	                b.calculate(principal, tenure, age, gender);
	}


}
