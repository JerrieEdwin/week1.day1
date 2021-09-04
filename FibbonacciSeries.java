package week1.day1.assignments;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		int range = 8;
		int f1 = 0;
		int f2 = 1;
		int sum;
		
		// Print first number
		System.out.println(f1);
		
		// Iterate from 1 to the range
		for (int i = 1; i <= range; i++)
		// add first and second number assign to sum
		{
			sum = f1 + f2;
			// Assign second number to the first number
			f1 = f2;
			// Assign sum to the second number
			f2 = sum;
			// print sum
			System.out.println(f1);
		}

	}

}
