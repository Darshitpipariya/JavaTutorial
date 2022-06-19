package co.darshit;

/*
 * super method
 * super keyword is use for accessing parent class method using or in child class
 */
class A{
	public A() {
		System.out.println("in A");
	}
	public A(int a) {
		System.out.println("In A with var");
	}
}
class B extends A{
	public B() {
		System.out.println("in B");
	}
	public B(int b) {
		super(); //it will be called by default and it will call default constructor
		System.out.println("In B with var");
	}
}
class C extends A{
	public C() {
		System.out.println("in C");
	}
	public C(int c) {
		super(c);
		System.out.println("In C with var");
	}
}

public class SuperDemo{
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(1);
		System.out.println("************");
		B b1=new B();
		B b2=new B(1);
		System.out.println("************");
		C c1=new C();
		C c2=new C(1);
		System.out.println("************");
	}
}