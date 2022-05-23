package co.darshit;
import java.util.*;
public class Pattern{
/*	###
	# #
	###  */
	public static void main(String[] args) {
		int line;
		Scanner sc=new Scanner(System.in);
		line=sc.nextInt();
		for(int row=0;row<line;row++) {
			for (int col=0;col<line;col++) {
				if(row==0 || row==line-1 || col==0 || col==line-1) {
					System.out.print('#');
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}