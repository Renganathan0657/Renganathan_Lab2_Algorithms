package com.transaction.main;
import java.util.Scanner;

import com.transaction.service.TransactionService;
public class TransactionDriver {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the total number of transactions done today");
		int size = scn.nextInt();
		int arr[]= new int[size];
		System.out.println("Please Enter the amounts of each transactions done today in Rupees");
		for (int i=0; i<size; i++)
			arr[i] = scn.nextInt();
		System.out.println("Please Enter the total no of targets to be achieved for today");
		int noOfTargets = scn.nextInt();
		TransactionService ts = new TransactionService();
		ts.checkTransaction(arr, noOfTargets);
		scn.close();
	}

}
