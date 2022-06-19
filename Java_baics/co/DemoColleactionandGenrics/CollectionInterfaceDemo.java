package co.DemoColleactionandGenrics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection Values = new ArrayList();
		Values.add(4);
		Values.add(5);
		Values.add(6);
		System.out.println(Values);
//		Iterator is interface which is responsible to fetch values from collection it has methods to help with that  
		Iterator it=Values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
