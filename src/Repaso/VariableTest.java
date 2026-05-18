package Repaso;

public class VariableTest {
	
	public static void main(String[] args) {
		//primitive variable
		var num1 = 1.1;
		int num2 = 1;
		int result = (int)num1 + num2;
		System.out.println(result);
		result = Calculator.sum((int)num1,num2);
		
		double result2 = num1/num2;
		result2 = division(num1, num2);
		System.out.println(result2);
		
		System.out.println(modulus(3.2f,3));
		//reference variable
		
		boolean stop = false;
		String color = "green";
		if(color == "green") {
			stop = false;
		}
		System.out.println(stop);
		
	}

	public static float modulus(float num1, int num2) {
		// TODO Auto-generated method stub
		return num1 % num2;
	}
	public static int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	public static double division(double num1, double num2) {
	
		return num1 / num2;
	}

}
