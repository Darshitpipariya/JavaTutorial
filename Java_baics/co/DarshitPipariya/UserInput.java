package co.DarshitPipariya;

import java.io.BufferedReader;
import java.io.*;
import java.io.InputStreamReader;
import java.util.*;
// BufferedR reader
// Scanner

public class UserInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = null; //read text from char-input stream,buffering characters so as to provide for the efficient reading of sequence of char.
		int k;
		
		/*
		 * create resource in try block
		 * handle it in catch block
		 * & close it in finally block
		 */
//		try {
//			
//			br=new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("Enter a number: ");
//			k=Integer.parseInt(br.readLine());//we have to convert string input to int
//			System.out.println(k);
//		}
//		catch (Exception e ){
//			System.out.println(e);
//		}
//		finally {
//			//use finally block to close resource
//			sc.close();
//			br.close();
//		}
		

//		for  input using scanner class we don't need to use try and catch block
		Scanner sc=new Scanner(System.in);//internally use regular expression to read different types
		System.out.println("Enter num");
		int x=sc.nextInt();
		System.out.println(x);
		
//		try with resource in that we do not need finally block to close resource it is closed as soon as scope of try block is finished
		try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));){
			System.out.println("Enter num");
			int x1=Integer.parseInt(br1.readLine());
			System.out.println(x1);
		}
		sc.close();
		
	}

}
