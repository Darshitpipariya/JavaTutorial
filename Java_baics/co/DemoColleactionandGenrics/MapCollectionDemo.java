package co.DemoColleactionandGenrics;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionDemo {
	public static void main(String[] args) {
		
//		Map<key,values>
		Map<String,String> values = new HashMap<>();
		values.put("one","Darshit");//(key,values) in put method first time with key it will create key val pair and for same key it will update value
		values.put("two","Vivek");
		values.put("three","Raj");
		values.put("four","Savan");
		values.put("five","hiren");
		
		System.out.println(values);
		
		System.out.println("Keys: "+values.keySet());
		System.out.println("Keys: "+values.values());
		
		for(String s:values.keySet()) {
			System.out.println(s+" : "+values.get(s));
		}
		
	}
}
