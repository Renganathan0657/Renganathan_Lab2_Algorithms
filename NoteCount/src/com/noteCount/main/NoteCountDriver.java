package com.noteCount.main;
import java.util.Scanner;
import com.noteCount.server.MergeSortImplementation;
import com.noteCount.server.NotesCount;

public class NoteCountDriver {

	public static void main(String[] args) {
		
		MergeSortImplementation msImp = new MergeSortImplementation();
		NotesCount nc = new NotesCount();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denomination");
		int size = scan.nextInt();
		
		System.out.println("Enter the values of currency denomination");
		int notes[] = new int[size];
		
		for(int i=0; i<size; i++) {
			 notes [i] = scan.nextInt();
		}
		
		System.out.println("Enter the amount to be paid");
		
		int amount = scan.nextInt();
		
		msImp.sort(notes, 0, notes.length-1);
		nc.notesCountImplementation(notes, amount);
		
		scan.close();
		
	}

}
