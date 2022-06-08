package co.darshit;
import java.util.*;
/*
 * there three type of array
 * 	1. 1d array
 *  2. Multidimensional array
 *  3. jagged array
 * */

public class arrayDemo{
	public static void main(String[] args) {
//		1d array
			int a[]=new int[5];
			int index=0;
			for(int i=0;i<a.length;i++) {
				a[i]=index++;
			}
			System.out.println(Arrays.toString(a));
			System.out.println("********************");
			
// 		multidimensional array
			int a1[][]= {{1,2},{3,4}};
			for (int outI[]:a1) {
				for (int innerI:outI) {
					System.out.println(innerI);
				}
			}
			System.out.println("********************");
//		Jagged array array with different size of rows
			int a2[][]= {
					{1,2,3},
					{4,5},
					{6,7,8,9,0}
			};
			for (int outI[]:a2) {
				for (int innerI:outI) {
					System.out.println(innerI);
				}
			}
			System.out.println("********************");
		}
}