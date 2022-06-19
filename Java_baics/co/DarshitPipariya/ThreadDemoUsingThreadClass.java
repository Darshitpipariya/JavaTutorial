package co.DarshitPipariya;

//we can implement thread using thread class & runnable interface(when multiple inheritance takes place)

//join method is used to join thread with main thread or parent thread from which it is created
// isAlive method is used to check if thread is alive or not

class Hello extends Thread{
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
class Hi extends Thread{

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
public class ThreadDemoUsingThreadClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Hello obj1=new Hello();
		Hi obj2=new Hi();
		
		obj1.setName("Hello thread");
		obj2.setName("Hi thread");
	
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		
		//we can set priority by 
		obj1.setPriority(1);//or obj1.setPriority(Thread.MIN_PRIORITY) //MIN_PRIORITY is constant with value 1
		obj2.setPriority(2);
		
		//range of priority goes 1(least) to 10(highest) 5 is normal
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		obj1.start();//will start thread by executing run method
		try {
			Thread.sleep(10);//wait for 10 miliseconds
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		obj2.start();//will start thread by executing run method
		
		obj1.join();//it will wait for thread obj1 to join main thread 
		obj2.join();//it will wait for thread obj1 to join main thread
//		after joining above thread remaining main code with execute without join main was running parallel with other threads
		System.out.println("Bye");
		

	}

}

