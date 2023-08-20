package com.kodnest.lcc;

import java.util.Scanner;

public class Main_2 {
	
	public static void checkGrade(int grade)
	{
		if( grade > 50)
		{ 
			System.out.println( " PASS");
		}
		else
		{ 
			System.out.println( "FAIL");
		}
		 
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		  Scanner scan= new Scanner(System.in);
		    int grade= scan.nextInt();
		    checkGrade(grade);	
		  
			  
		  }
	}


