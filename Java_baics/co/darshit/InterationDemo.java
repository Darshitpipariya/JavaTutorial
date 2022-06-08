package co.darshit;

public class InterationDemo{
	// while , do while, for , for each
	public static void main(String[] srgd) {
		int i=1;
		while (i<10) {
			System.out.println("Hello!");
			i++;
		}
		i=0;
		do {
			System.out.println("Hello!");
			i++;
		}while(i<10);
		
		for (i=0;i<0;i++) {
			System.out.println("Hello for!");
		}
		String[] ch= {"darshit","pipariya"};
//		extended for loop
		for(String c:ch) {
			System.out.println(c);
		}
	}
}