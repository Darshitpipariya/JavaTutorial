package co.darshit;

//we cannot create direct object of abstract class
// ex. number is abstract class but we have to create obj using int or float or double or short class
// abstact methods are allowed in abstract class and we have to define abstract method in child class
abstract class writer{
	public abstract void writeMetod();
}
// here writer class work as interface you can check in InterfaceDemo.java
class pen extends writer{
	public void writeMetod() {
		System.out.println("writing using pen");
	}
}

class pencil extends writer{
	public void writeMetod() {
		System.out.println("writing using pencil");
	}
}

class kit{
	public void doSometing(writer p) {
		p.writeMetod();
	}
}

public class AbstractDemo{
	public static void main(String[] args) {
//		writer wr=new writer();  we cannot create object of writer class
		pen pn=new pen();
		pencil pc=new pencil();
		pn.writeMetod();
		pc.writeMetod();
		
		kit k1=new kit();
		k1.doSometing(pc);
		k1.doSometing(pn);
	}
}