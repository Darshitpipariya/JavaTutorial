package co.darshit;

// single abstract interface
@FunctionalInterface
interface ABC3{
	void show();
}

public class InterfaceLamdaDemo{
	public static void main(String[] args) {
//		ABC3 obj=new ABC3() {
//			public void show() {
//				System.out.println("i am best!");
//			}
//		};
//		Instead of this we can use lambda expression  because interface has only one method to implement 
		ABC3 obj=()->{
			System.out.println("i am best!");
		};
		obj.show();

	}
}