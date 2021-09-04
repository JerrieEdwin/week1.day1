package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an int Input and assign a value 13
		int num = 39;

		// Declare a boolean variable flag as false
		boolean prime = false;

		// Iterate from 2 to half of the input
		for (int i = 2; i < 13 / 2; i++)

		// Divide the input with each for loop variable and check the remainder
		{
			int remainder = num % i;
			
		// Set the flag as true when there is no remainder
			if (remainder == 0) {
				prime = true;
		// break the iterator
				break;
			}
		}
		// Check the flag (Provide a condition)
		if (prime == true) {
		// Print 'Not a Prime' when the condition doesn't match
			System.out.println("It is not a prime number");
		}
		// Print 'Prime' when the condition matches
		else {
			System.out.println("It is a prime number");
		}

	}

}
