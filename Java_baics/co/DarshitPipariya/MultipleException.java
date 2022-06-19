package co.DarshitPipariya;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[6];
			int i=7;
			int j=2;
			int k=i/0;
			System.out.println("output is: "+k);
		}
		/*
		 * 	catch(ArithmeticException e) {
				System.out.println("Error: "+e);
			}
			catch( ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: "+e);
			}
		 * 
		 */
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: "+e);
		}
		finally {//it execute in both cases
			System.out.println("bye");
		}
	}

}
