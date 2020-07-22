package com.wipro.eb.main;

import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;

public class Main {
	public static void main(String a[]) throws InvalidReadingException, InvalidConnectionException
	{
	System.out.println(new ConnectionService().generateBill(130,100,"Commercial"));
	}

	

}