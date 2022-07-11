package com.transaction.service;
import java.util.Scanner;
public class TransactionService {
	public void checkTransaction(int arr[], int noOfTargets) {
		Scanner scn = new Scanner(System.in);
		while (noOfTargets-- !=0) {
			int flag = 0;
			long target;
			System.out.println("Please Enter the target amount to be achieved for today in Rupees");
			target = scn.nextLong();
			long sum = 0;
			for (int i=0; i<arr.length; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after" +" "+ (i+1)+" " + "transaction");
					flag=1;
					break;
					
				}
			}
			if(flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
		
		scn.close();
	}
}
