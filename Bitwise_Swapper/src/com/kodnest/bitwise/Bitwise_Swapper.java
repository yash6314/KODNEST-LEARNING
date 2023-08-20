package com.kodnest.bitwise;

import java.util.Scanner;

public class Bitwise_Swapper {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first integer: ");
		        int first = scanner.nextInt();

		        System.out.print("Enter the second integer: ");
		        int second = scanner.nextInt();

		        swapUsingBitwise(first, second);

		        System.out.println("After swapping: First = " + first + ", Second = " + second);
		    }

		    public static void swapUsingBitwise(int a, int b) {
		        // Using a temporary variable to hold one value during swapping
		        int temp = a;
		        a = a ^ b;
		        b = temp ^ b;
		        a = a ^ b;

		        // Update the original variables with the swapped values
		        int first = a;
		        int second = b;
		    }
		

	}


