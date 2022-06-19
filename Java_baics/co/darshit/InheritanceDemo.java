package co.darshit;

// multiple inheritance is not supported by Java because it cause ambiguity problem
// in java we have single level,multilevel,tree inheritance
// to relationship HAS-a,IS-a
class c1{
	public c1() {
		System.out.println("In c1");
	}
	public void fun1() {
		System.out.println("In c1 fun1");
	}
}
// single level
class c2 extends c1{
	public c2() {
		System.out.println("In c2");
	}
}
// multilevel
class c3 extends c2{
	public c3() {
		System.out.println("In c3");
	}
}
// tree c2 & c4 both from c1
class c4 extends c1{
	public c4() {
		System.out.println("In c3");
	}
}

public class InheritanceDemo{
	public static void main(String[] args) {
		c1 o1=new c1();
		System.out.println(o1.getClass());
		c2 o2=new c2();
		System.out.println(o2.getClass());
		c1 o21=new c2();
		System.out.println(o21.getClass());
		c3 o3=new c3();
		System.out.println(o3.getClass());
		c1 o31=new c3();
		System.out.println(o31.getClass());
		c2 o32=new c3();
		System.out.println(o32.getClass());
		c4 o4=new c4();
		System.out.println(o4.getClass());
		c4 o41=new c4();
		System.out.println(o41.getClass());
		
	}
}
