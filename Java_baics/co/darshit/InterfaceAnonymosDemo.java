package co.darshit;
/*
 * when we are creating interface to implement we have to use another class
 * but if that class is only used for the implementation porpus then instade of 
 * this we can use anonymous class
 */

interface ABC1{
	void show();//by default public & abstract
}
/*
class Implementor implements ABC1{
	public void show() {
		System.out.println("Anything!");
	}
}
*/

public class InterfaceAnonymosDemo{
	public static void main(String[] args) {
		ABC1 obj1=new ABC1() {
			public void show() {
				System.out.println("Anything!");
			}
		}; //anonymous class to implement interface we use this when we don't have to reuse it
		obj1.show();
	}
	
	
}