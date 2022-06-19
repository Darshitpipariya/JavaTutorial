package co.DarshitPipariya;


// runnable interface is a functional interface it has only one method which is run
// we use runnable interface when we have to inherit other class in our thread class and also implements thread
class ThreadDemoUsingRunnableInterfaceEX{
	public int count;
}
class Hello1 extends ThreadDemoUsingRunnableInterfaceEX implements Runnable{
	// override method from Thread class
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!");
			try {
				Thread.sleep(1000);//wait for 2 seconds
			}catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
class Hi1 extends ThreadDemoUsingRunnableInterfaceEX implements Runnable{
	// override method from Thread class
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi!");
			try {
				Thread.sleep(1000);//wait for 2 seconds
			}catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}

public class ThreadDemoUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello1 obj1=new Hello1();
		Hi1 obj2=new Hi1();
		Thread t1=new Thread(obj1);//we are passing runnable object to Thread class
		Thread t2=new Thread(obj2);
		
		t1.start();//will start thread by executing run method
		try {
			Thread.sleep(10);//wait for 10 milliseconds
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		t2.start();//will start thread by executing run method
		

	}

}

/*
 *as we are using hi and hello class only to implement Runnable interface & Runnable is functional interface we can 
 *convert that into lambda expression to shorten code above code(without the ThreadDemoUsingRunnableInterfaceEX class implementation) 
 *can be written  as bellow using only main()
 *
 *
 */


/*
					public class ThreadDemoUsingRunnableInterface {
					
						public static void main(String[] args) {
							// TODO Auto-generated method stub
							
					//		Runnable obj1;
							Runnable obj2=()-> {
									for (int i = 0; i < 5; i++) {
										System.out.println("Hello!");
										try {
											Thread.sleep(1000);//wait for 2 seconds
										}catch (Exception e) {
											System.out.println("Error: " + e.getMessage());
										}
									}
								};
							Thread t1=new Thread(()->{
								for (int i = 0; i < 5; i++) {
									System.out.println("Hi!");
									try {
										Thread.sleep(1000);//wait for 2 seconds
									}catch (Exception e) {
										System.out.println("Error: " + e.getMessage());
									}
								}
							},"set thread name");//we are passing runnable obj1 code to Thread class 
							
					//		we can also do same for obj2 
							Thread t2=new Thread(obj2,"Set thread name");
							
							t1.start();//will start thread by executing run method
							try {
								Thread.sleep(10);//wait for 10 milliseconds
							}catch (Exception e) {
								System.out.println("Error: " + e.getMessage());
							}
							t2.start();//will start thread by executing run method
						
						}
					}
*/