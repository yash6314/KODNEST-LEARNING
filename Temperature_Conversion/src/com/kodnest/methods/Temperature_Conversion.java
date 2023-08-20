package com.kodnest.methods;

import java.util.Scanner;

public class Temperature_Conversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Choose the Conversion method\n"+"Enter 1 for Celsius to Fahrenheit conversion\n"+"Enter 2 for Fahrenheit to Celsius conversion\n");
		int num=scan.nextInt();
		if(num ==1) {
			System.out.println("Enter the temperature in celsius");
			double celsius=scan.nextDouble();
			System.out.println(celsius+"°C is equivalent to "+celsiusToFahrenheit(celsius)+"°F");
			
		}else if(num==2) {
			System.out.println("Enter the temperature in Fahrenheit");
			double fahrenheit=scan.nextDouble();
			System.out.println(fahrenheit+"°F is equivalent to "+fahrenheitToCelsius(fahrenheit)+"°C");
		}else {
			System.out.println("Choose the conversion method Correctly");
		}
		
		}
		public static double celsiusToFahrenheit(double celsius)
		{
			return  ((celsius*9/5)+32);
		}
		public static double fahrenheitToCelsius(double fahrenheit){
			return (fahrenheit - 32)*5/9;
		}

	}

