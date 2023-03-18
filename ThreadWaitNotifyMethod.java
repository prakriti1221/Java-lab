package multithreading;

public class ThreadWaitNotifyMethod extends Thread {
public void run() {
		
	}
	public  static void main(String[] args)
	{
		Thread2 th2 = new Thread2();
		th2.start();
		
		synchronized (th2) {
			try {
				System.out.println("Waiting for th2 to complete....");
				th2.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Total is: "+ th2.total);
		}	
	}
}

class Thread2 extends ThreadWaitNotifyMethod
{
	int total;
	@Override 
	public void run()
	{
		synchronized (this) {
			for(int i=0;i<=10;i++)
			{
				total+=i;
			}
			notify();
		}
	}
}
