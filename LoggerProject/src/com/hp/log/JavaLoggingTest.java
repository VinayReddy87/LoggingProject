package com.hp.log;



public class JavaLoggingTest
{
	
	public static void main(String a[])
	{
		System.out.println("Hi.. We are logging info");
		Logger.debug(JavaLoggingTest.class ,"ConfigurationService:validateConfig().");
		System.out.println("Hi.. We are Stopped logging info");
		
	}

}

