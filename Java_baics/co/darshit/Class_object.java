package co.darshit;
import java.util.*;
class Calc
{
	int num1;
	int num2;
	int result;
	String s;
	public void perform() {
		result=num1+num2;
	}
}

public class Class_object{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calc obj1=new Calc();
		obj1.num1=sc.nextInt();
		obj1.num2=sc.nextInt();
		sc.nextLine();
		obj1.s=sc.nextLine();
		obj1.perform();
		System.out.println(obj1.result);
		System.out.print(obj1.s);
	}
}
