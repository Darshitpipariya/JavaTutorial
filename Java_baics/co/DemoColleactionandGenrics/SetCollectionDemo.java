package co.DemoColleactionandGenrics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionDemo {

	public static void main(String[] args) {
		Set<Integer> values= new HashSet<>();
//		we are using hashset to save it will use hase function so you will not get in same sequence as you entered
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(4);
		System.out.println(values);
		for(int i:values) {
			System.out.println(i);
		}
		
		
		Set<Integer> values1= new TreeSet<>();
//		we are using TreeSet  we will get all values in sorted sequence
		values1.add(1);
		values1.add(21);
		values1.add(32);
		values1.add(44);
		values1.add(42);
		System.out.println(values1);
		for(int i:values1) {
			System.out.println(i);
		}
	}
}
