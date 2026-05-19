package Repaso;


public class Calculator {
	
	public final double PI = 3.14;
	public static int number = 0;
	public int number2 = 0;
	
	public static float modulus(float num1, int num2) {
		number = 0;
		return num1 % num2;
	}
	
	public float modulus1(float num1, int num2) {
		number2 = 10;
		modulus(20, 30);
		return num1 % num2;
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double division(double num1, double num2) {
		return num1 / num2;
	}


}