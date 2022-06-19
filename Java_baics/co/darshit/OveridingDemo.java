package co.darshit;
class A1{
	public void demo() {
		System.out.println("in A");
	}
}
class B1 extends A1{
//	using @Override we can get compile time instead of getting logical error
//	we use override method to overwrite parent class method using subclass method
	@Override
	public void demo() {
		super.demo();
		System.out.println("in B");
	}
	public void config() {
		System.out.println("in B config");
	}
}

class Cdemo extends A1{
//	@Override
	public void demo(){
		System.out.println("in C2");
	}
}

public class OveridingDemo{
	/*
	 * we have two type of polymorphism compile time & run time 
	 */
	public static void main(String[] args) {
		B1 obj2 =new B1();
		A1 obj1=new B1(); //runtime   // we are creating object to reference A using Class B1
		A1 obj3=new A1();
		obj2.demo();
		System.out.println("************");
		obj1.demo();
//		obj1.config(); obj don't know about config function as it has reference of class A1
		obj1=new Cdemo();// Dynamic method dispatch (to achieve we have to use runtime polymorphism)  //using obj1 reference we are creating object of C1 class
		obj1.demo();
		System.out.println("************");
		obj3.demo();
		System.out.println("************");
	}
}
