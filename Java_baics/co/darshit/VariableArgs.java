package co.darshit;


class Calculator{
	public int sum(int arg1,int arg2) {
		return arg1+arg2;
	}
	
	public int varsum(int ... arg) {/* arg is variable length argument*/
		int sum=0;
		for(int iVal:arg) {
			sum+=iVal;
		}
		return sum;
	}
}

public class VariableArgs{
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.sum(1,2));
		System.out.println(c.varsum(1,2,3,4,5,6,7));
	}
}