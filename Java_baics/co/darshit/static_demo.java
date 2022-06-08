package co.darshit;
import java.util.*;

class emp{
	int eid;
	int salary;
	static String ceo;
	
	static {    //for initializing static variable  it execute when class get load
		ceo="dars";
	}
	
	public emp() { // it executed when object is created
		eid=0;
		salary=0;
	}
	public emp(int eid,int salary) {
		this.eid=eid;
		this.salary=salary;
	}
	
	public void show() {
		System.out.println(eid +" : "+salary+" : "+ceo);
	}
}

public class static_demo {
	public static void main(String[] args) {
		emp darshit=new emp(1,100000);
		emp vivek=new emp(2,1000000);
		emp.ceo="Dar"; 
		/*
		static assigment with class name
		we can use object name 
		we prefer to use class name
		*/
		darshit.show();
		vivek.show();
	}
}