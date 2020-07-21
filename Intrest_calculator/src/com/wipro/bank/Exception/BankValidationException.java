package com.wipro.bank.Exception;

public class BankValidationException extends Exception {
	public String toString()
	{
		return "Invalid data";
	}
public BankValidationException(String str)
{
	super(str);
}

}
