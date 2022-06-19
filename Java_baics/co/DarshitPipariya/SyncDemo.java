package co.DarshitPipariya;

class Counter{
	int count;
	public synchronized void increment() {
		// synchronized only allowed one thread to run at a time
		// it is used when there is common resource in multiple threads (critical sections)
		count++;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}


public class SyncDemo {
	public static void main(String[] args) throws Exception {
		Counter c=new Counter();
		
//		lambda expression to implement runnable interface
		Thread t1=new Thread(
				()->{
					for (int i=0; i < 500; i++) {
						c.increment();
					}
				}
				,"CounterIncrementThred1");
		t1.start();
		Thread t2=new Thread(
				()->{
					for (int i=0; i < 500; i++) {
						c.increment();
					}
				}
				,"CounterIncrementThred2");
		/*                OR
		 * Thread t2=new Thread(new Runnable() {
		  			public void run() {
						for (int i=0; i < 500; i++) {
							c.increment();
						}
					}
				}
				,"CounterIncrementThred2");
		 */
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Count: "+c.getCount());
	}

}
