package practical;

public class Lab3_MultithreadingApproach {
	public static void main(String[] args) {
		// Approach 1: Thread Class Approach
				ThreadClassApproach tc = new ThreadClassApproach();
				tc.start();
				
				// Approach 2: Runnable Interface Approach
				InterfaceApproach ia = new InterfaceApproach();
				Thread thread = new Thread(ia);
				thread.start();
	}
}
