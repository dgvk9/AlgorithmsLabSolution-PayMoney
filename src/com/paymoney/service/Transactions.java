package com.paymoney.service;

public class Transactions {
	
	public void checkTransaction(int[]transactions, int size, int target) {
		
		boolean has_achieved = false;
		int sum = 0;
		for(int i=1; i<=size; i++) {
			sum = sum + transactions[i-1];
			if(sum>=target) {
				System.out.println("Target achieved after "+ i + " transactions");
				has_achieved = true;
				break;
			}
		}
		System.out.println();
		if(has_achieved == false) {
			System.out.println("Given target is not achieved");
	}
	}

}
