package Repaso;

public class Algorithm3 {
	public static void main(String[] args) {
		//create an array with a capacity of 6
		int[] integer = {2, 324,34, 3, 0, 3453};	
		//view the length of the array
		System.out.println(integer.length);
		//create an array with capacity 20000
		int[] ints = new int[20000];
		ints[499] = 34234;
		System.out.println(ints[499]);
		float[] fls = {324, 234};
		Calculator[] cls = {new Calculator(), new Calculator()};
		System.out.println(cls[0]);
		System.out.println(cls[1]);
		System.out.println(integer[6]);
		}
}
