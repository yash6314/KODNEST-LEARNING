package com.kodnest.lcc;

import java.util.Scanner;

public class main

{

public static void checkGrade(int grade)

{

	if(grade>50)
	{
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}

}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	int grade=scan.nextInt();
	checkGrade(grade);
	
}

}