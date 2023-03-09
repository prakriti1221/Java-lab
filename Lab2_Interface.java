package practical;

interface FirstInterface {
	// All the methods are by default public and abstract
	void method1();

	void method2(int a);

	int x = 20;

}
interface SecondInterface extends FirstInterface {
	void method1();

	int x = 40;
}
class Prakriti {

}

public class Lab2_Interface extends Prakriti implements FirstInterface, SecondInterface{
	
	public static void main(String[] args) {
				System.out.println("Value of x = " + FirstInterface.x);
			}

			@Override
			public void method1() {
				System.out.println("Method 1 called.");
			}
			@Override
			public void method2(int a) {
				System.out.println(a);
			}
	}

