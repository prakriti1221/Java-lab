package multithreading;

public class ThreadSleepMethod extends Thread {
	public void run() {
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}
	
		
	public static void main(String[] args){

			ThreadSleepMethod tm = new ThreadSleepMethod();
			tm.start();
	}
}
