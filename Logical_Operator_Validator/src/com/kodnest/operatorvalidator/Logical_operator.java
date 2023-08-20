package com.kodnest.operatorvalidator;

import java.util.Scanner;

public class Logical_operator {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Is input valid (true/false): ");
		        boolean isValid = scanner.nextBoolean();

		        System.out.print("Does input meet a certain condition (true/false): ");
		        boolean meetsCondition = scanner.nextBoolean();

		        boolean isValidInput = isValidInput(isValid, meetsCondition);

		        if (isValidInput) {
		            System.out.println("Input is valid.");
		        } else {
		            System.out.println("Input is not valid.");
		        }
		    }

		    public static boolean isValidInput(boolean isValid, boolean meetsCondition) {
		        // Validate based on conditions using logical operators
		        return isValid && meetsCondition; // Both conditions must be true
		    }
		

	}


