package com.kodnest.lw;

public class labelledwhile {
public static void main(String[] args) {
	int i=1;
	rajini:while(i<=5) {
		int j=1;
		yash: while(j<=5) {
			System.out.println("* ");
			break rajini;
		}
	}
}
}
