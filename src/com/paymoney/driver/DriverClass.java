package com.paymoney.driver;

import java.util.Scanner;

import com.paymoney.service.Transactions;

public class DriverClass {

	public static void main(String[] args) {
		
		Transactions trx = new Transactions(); // create reference to transaction object
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of transaction array: ");
		int size = in.nextInt();
		
		//Array to store no of transactions provided
		int[] transactions = new int[size];
		
		//Accept and populate transaction array with values
		System.out.println("Enter the values of the array: ");
		for(int i=0; i<size; i++) {
			transactions[i] = in.nextInt();
		}
		
		//Accept how many targets that needs to be achieved
		System.out.println("Enter the total number of target that need to be achieved: ");
		int total_target = in.nextInt();
		
		//Loop through each target checking whether it is achieved
		
		while(total_target > 0) {
			System.out.println("Enter the value of target: ");
			int target = in.nextInt();
			trx.checkTransaction(transactions, size, target);
			total_target--;
			
		}
		
		in.close();

	}

}
