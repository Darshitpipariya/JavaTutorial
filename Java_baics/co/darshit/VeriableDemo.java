package co.darshit;

import java.util.Scanner;

public class VeriableDemo{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long l = 5000000000000l; //8byte
		int i=500000; // 4byte
		short s= 5; //2byte
		byte b=5;// 1byte
		
		float f=5.5f; //4byte
		double d=5.5;	//8 byte
		
		int c=11;
		
		System.out.println(c);
		
		c=66; //change according to ASCII
		c=sc.nextInt();
		System.out.println(c);
		
		double d1=5; //implicit type conversion
		System.out.println(d1);
		
		int i1=(int)5.5;
		System.out.println(i1);
		
		
		
		
	}
}