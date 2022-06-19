package co.darshit;
//Boxing or Wraping-> store data in java with help of object
//int, float, char are primitive data type

public class WarrperDEmo{
	/*
	 * when we store using int ,float and char keyword variable becomes 
	 * primitive data not object this concept has taken from C lag.
	 * 
	 * to store variable as object we use warper class
	 * for int -> Integer()
	 * for float->Float()
	 * for char->Character()
	 * byte->Byte()
	 * short->Short()
	 * long->Long()
	 * double->Double()
	 * boolean->Boolean()
	 * */
	public static void main(String[] args) {
		int i=5;//primitive data type
		
		Integer ii=new Integer(i);// Wrapper class  BOXING OR WRAPPING
		Integer i1=i; // auto boxing
		int i2=i1;//auto unboxing
		Float f=new Float(5.5);
		int j=ii.intValue();
		
		float f1=f.floatValue();//UNBOXING OR UNWRAPPING
		System.out.println(i);
		System.out.println(j);
		System.out.println(f1);
	}
	
}