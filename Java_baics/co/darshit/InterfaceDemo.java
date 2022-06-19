package co.darshit;
/*
 * types of interface
 * 1-> normal(with multiple methods) interface
 * 2-> single abstract method(SAM) interface->Functional interface ->it can be used to implement lambda expression
 * 3-> Marker(it doesn't have any methods) interface
 */

interface wr1{
// Marker interface	
}

interface wr2{
//	normal interface
	public abstract void writeMetod();
	public abstract void writeMetod2();
}
//we can also use interface to implement multiple inheritance indirectly
interface writer1{
//	single abstract method interface
	public abstract void writeMetod();
	//we cannot define non-abstract method in interface but in abstract class we can define
//	in interface all the method is by default public abstract so we not need to metioned every time
	
}
class ABC{
	public ABC() {
		System.out.println("you are in ABC class");
	}
}
class pen1 extends ABC implements writer1{//here we achive multiple inheritance with the help of interface & extends
	public void writeMetod() {
		System.out.println("you are writing using pen!!!");
	}
}
//we can implement multiple interface but there can be ambiguity problem and to remove it override that method in child class use Super keyword to call method of perticular interface
//ex.  writer1.super.writeMethod(); inside method
/*
 * @Override
 * public void writeMethod{
 *  	writer1.super.writeMethod();
 * }
 */
class pencil1 implements writer1 ,wr1{
	public void writeMetod() {
		System.out.println("you are writing using pencil!!!");
	}
}

class kit1{
	public void doSometing(writer1 p) {
		p.writeMetod();
	}
}

public class InterfaceDemo{
	public static void main(String[] args) {
		kit1 k=new kit1();
		writer1 pe=new pen1();//we are creating object of pen and reference it with writer
		writer1 pc=new pencil1();
		k.doSometing(pc);
		k.doSometing(pe);
	}
}