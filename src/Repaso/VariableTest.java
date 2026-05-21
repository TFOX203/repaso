package Repaso;

public class VariableTest {
	
	public static void main(String[] args) {
		//primitive variable
		var num1 = 1.1;
		int num2 = 1;
		int result = (int)num1 + num2;
		System.out.println(result);
		result = Calculator.sum((int)num1,num2);
		
		double result2 = num1 /num2;
		result2 = Calculator.division(num1, num2);
		System.out.println(result2);
		
		System.out.println(Calculator.modulus(3.2f, 3));
		
		//reference variable
		
		//polymorphism
		Object obj = new Calculator();
		Calculator cal = new Calculator();
		
		
		
	}
}
