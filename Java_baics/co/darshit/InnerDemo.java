package co.darshit;
//import java.util.Scanner;
/*
 * inner class
 * ->	Member class
 * ->	static class
 * ->	Anonymous class
 * 
 */

class Outer{
	static int ex1;
	int ex2;
	static {
		ex1=10;
	}
	static class iner{
		public void display() {
			System.out.println("Static Inner");
		}
	}
	class Inner{
		public void display() {
			System.out.println("Inner");
		}
	}
}

public class InnerDemo{
	public static void main(String[] args) {
		System.out.println(Outer.ex1);//static variable access using class name
		Outer ou1=new Outer();
		Outer.Inner in1=ou1.new Inner(); //create inner class object using outer class object
		in1.display();
		Outer.iner in2=new Outer.iner(); //create inner static classobject using class name
		in2.display();
	}
}