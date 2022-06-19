package co.darshit;

/*
 * final keyword can be used with variable,class & method
 * when using with variable for constant & we can assign value once
 * when using with class for not allow inherit by any other class
 * when using with function for not allowing change definition(override) by inherited class
 */
final class FinalDemo1{
	public FinalDemo1() {
		System.out.println("final class demo FinalDemo1");
	}
}
//class FinalDemo2 extends FinalDemo1{
//    NOT ALLOWED TO EXTENDS FINAL CLASS	
//}

class FinalDemo3{
	final int num=10;
	public final void demo() {
		System.out.println("final method not allowed to overide by inherited class");
	}
}

class FinalDemo4 extends FinalDemo3{
	
}

public class FinalDemo{
	public static void main(String[] args) {
	FinalDemo1 f1=new FinalDemo1();
	FinalDemo3 f3=new FinalDemo3();
//	f3.num=11;  NOT ALLOWED
	f3.demo();
	FinalDemo4 f4=new FinalDemo4();
	f4.demo();
	}
	
}