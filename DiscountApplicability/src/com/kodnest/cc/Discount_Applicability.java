package com.kodnest.cc;

import java.util.Scanner;

public class Discount_Applicability {
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Amount ");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
		
	}
	public static void checkDiscount(double purchaseAmount)

		{
	
		if(purchaseAmount>100)
		{
			System.out.println("Discount Applicable");
		}

	}


}
