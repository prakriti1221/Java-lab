package multithreading;

public class ThreadYieldMethod {
	synchronized public void run() {
		for(int i=0;i<3;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}
	
		
	public static void main(String[] args){

			ThreadSleepMethod tm = new ThreadSleepMethod();
			tm.start();
			
			for(int i=0;i<3;i++) {
				System.out.println(Thread.currentThread().getName() + " is running");
			}		
	}
}
