package com.internship.training;

public class TestNestTry {
	public static void main(String[] args) {
		try
		{
			try
			{
				int a[] = new int[5];
				a[5] = 4;
			}
		catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println(e);
			}
		try {
			System.out.println("going to divide");
			int b = 30/0;
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		}
		System.out.println("other statement");
		}
	catch (Exception e) {
		System.out.println("handled");
		
	
		
	}

}}

