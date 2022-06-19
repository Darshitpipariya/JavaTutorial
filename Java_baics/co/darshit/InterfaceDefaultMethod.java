package co.darshit;

// Abstract class -> define and declare function allowed
// Interface ->only declare upto java 1.7
// but in from java 1.8 we can define method in interface using default keyword
// we can create static method in interface from java 1.8
// by default if we define variable inside interface it is constant.


@FunctionalInterface//only one method declaration any number of default method 
interface demo1{
	int num=8;// final int num=8; //by default it is constant
	void abc();//method declaration
	default void show() {
		System.out.println("Default method in interface");
	}//this method can be override in child class
	static void demomethod() {
		System.out.println("in static method");
	}
}

class InterfaceDefaultMethod1 implements demo1{
	public void abc() {
		System.out.println("abc method in interface");
	}
}

public class InterfaceDefaultMethod{
	public static void main(String[] args) {
		InterfaceDefaultMethod1 obj=new InterfaceDefaultMethod1();
		obj.abc();
		obj.show();
		
//		to call static method we required classname(interfacename).methodname
		demo1.demomethod();
	}
}