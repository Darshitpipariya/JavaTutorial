package co.DarshitPipariya;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[6];
			int i=7;
			int j=0;
			if (j==0) {
				throw new DemoException("j is zero");  //create class DemoException that extended from Exception class
			}
			int k=i/0;
			System.out.println("output is: "+k);
		}
		catch(DemoException e) {
			System.out.println("Error: "+e.getMessage());
		}


	}

}
