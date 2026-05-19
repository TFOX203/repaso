package Repaso;

import java.util.Scanner;



public class Algorithm1 {
	public static void main(String[] args) {
		//inputs: three numbers, can be represented by three variables
		int a,b,c;
		//create scanner object to establish communication between our app and the console
		Scanner sc = new Scanner(System.in);
		System.out.println("primer numero");
		a = sc.nextInt();
		System.out.println("segundo numero");
		b = sc.nextInt();
		System.out.println("tercer numero");
		c = sc.nextInt();
		System.out.println("the result is " + combineDigits(a,b,c));
		
		long startTime = System.nanoTime();
		
		
		System.out.println("the result is" + combineDigits(a, b, c));
		long endTime = System.nanoTime();
		System.out.println("the time consumed " + (endTime - startTime));
		sc.close();
	}
	
	/**
	 * combine all the digits to form a integer
	 * @param a the highest digit
	 * @param b 
	 * @param c the lowest digit
	 * @return the combined integer
	 */

	private static int combineDigits(int a, int b, int c) {
		//validation of the inputs
		//logical operator: or || and &&, not !
		if(a > 9 || a < 0 || b > 9 || b < 0 || c > 9 || c < 0) {
			System.out.println("Your number shoud be single digit and non negative");
			//throw new InvalidArgsExecption()
			return 0;
		}
		//if a is less than 10 and great than 0 ....
		if(!(a <= 9 && a >= 0 && b <= 9 && b >= 0 && c <= 9 && c >= 0)){
			//if all the condition are meet
			//if one of the condition is satisfied
			System.out.println("Your number shoud be single digit and non negative");
			//throw new InvalidArgsExecption()
			return 0;
		}
		
		//implementation of the algorithm
		//a = a * 100;
		a *= 100;
		b *= 10;
		//output
		return a + b + c;
	}

}
