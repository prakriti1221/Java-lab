package practical;

public class Lab1_Sorting {
	public void SortingNum(int[] num) { // Method Declaration
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[i]) {
					int temp;
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("The sorted elements are:");
		for (int n : num)
			System.out.println(n);
	}

	public static void main(String[] args) {
		int[] numbers = { 23, 2, 74, 8, 10, 25, 32, 15, 12 };
		System.out.println("The array elements are:");
		for (int n : numbers )
			System.out.println(n);

		Lab1_Sorting s = new Lab1_Sorting();
		s.SortingNum(numbers);

	}
		
}
