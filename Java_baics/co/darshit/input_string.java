package co.darshit;

import java.util.Scanner;

public class input_string {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String word [];
		String temp;
		word=text.split(" ");
		for (int i = 0; i < word.length; i++) {
	        for (int j = i+1; j < word.length; j++) {
				if(word[i].length()>word[j].length()) {
					temp=word[i];
					word[i]=word[j];
					word[j]=temp;
				}
				else if(word[i].length()==word[j].length()) {
					if (word[i].compareTo(word[j])>0) 
	                {
	                    temp = word[i];
	                    word[i] = word[j];
	                    word[j] = temp;
	                }
				}
			}   
		}
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		

        
		     		       
	}	
}
