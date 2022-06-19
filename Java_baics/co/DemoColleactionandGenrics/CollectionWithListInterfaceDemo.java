package co.DemoColleactionandGenrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Stud implements Comparable<Stud>{
	int Rollno;
	String Name;
	int Mark;
	
	public Stud(int rollno, String name, int marks) {
		super();
		Rollno = rollno;
		Name = name;
		Mark = marks;
	}
	
	@Override
	public String toString() {
		return "Stud [Rollno=" + Rollno + ", Name=" + Name + ", Mark=" + Mark + "]";
	}

	//we have to define compareTo method for Stud class which is mentioned in Comparable interface
//	here we are sorting in decreasing order
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		return this.Rollno>o.Rollno?-1:1;
	}
	
	
}

public class CollectionWithListInterfaceDemo {
	public static void main(String[] args) {
		List<Integer> Values = new ArrayList<>();
		Values.add(1);
		Values.add(2);
		Values.add(3);
		Values.add(2, 10);//at index 3 add 10
		System.out.println(Values);
		
	//	since list support index we can use for loop to go through List and
		for(int i:Values){
			System.out.println(i);
		}
		
		for(int i=0;i<Values.size();i++) {
			System.out.println(Values.get(i));
		}
		
		List listofObject=new ArrayList();
		listofObject.add(10);
		listofObject.add(1,1001);
		listofObject.add(10002);
		listofObject.add(2,1000003);
		System.out.println("************************");
		System.out.println(listofObject);
		Iterator it=listofObject.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Enhanced for loop
		for(Object i:listofObject) {
			System.out.println(i);
		}
		
		for(int i=0;i<listofObject.size();i++) {
			System.out.println(listofObject.get(i));
		}
		
		
		
		//we have Collections class which has some enhanced functionality to perform on List objects
		Collections.sort(Values);//sort in ascending order
		Collections.reverse(Values);//reverse in list
		System.out.println(Values);
		//List is by default mutable
		
/*	Comparator Interface
//		used to change how we compare objects while sorting
// as Comparator is functional interface we can implement by anonymous class or lambda functional
		Integer class implement comparator interface*/
		
		//sort based on last digit only 
		Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				return i%10>j%10?1:-1;//1 means swap , -1 means not swap				
			}
		};
		
		Collections.sort(Values,c);//c is comparator object
		
		System.out.println("After comparator Interface  "+Values);
		
		
/* now to compare the two object of students we have to use the Comparable interface to
 * 
 */		List<Stud> s=new ArrayList<>();
		s.add(new Stud(1,"Darshit",10));
		s.add(new Stud(2,"Vivek",1010));
		s.add(new Stud(3,"Raj",123));
		s.add(new Stud(4,"Savan",145));
		s.add(new Stud(5,"Hiren",155));
		
		Collections.sort(s);
		System.out.println(s);
		//changing comparison function compare based on marks in ascending order
		Comparator<Stud> c1=new Comparator<>() {
			public int compare(Stud s1,Stud s2) {
				return s1.Mark>s2.Mark?1:-1;
			}
		};
		Collections.sort(s,c1);
		System.out.println(s);
		
	}
}
