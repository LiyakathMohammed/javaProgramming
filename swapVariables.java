package javaIntroduction;
import java.util.*;
public class ConvertingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int number1, number2, temp;
		number1 = sc.nextInt();
		System.out.println("Enter the second number:");
		number2 = sc.nextInt();
		temp = number2;
		number2 = number1;
		number1 = temp;
		System.out.println("The first number's value is " + a);
		System.out.println("The second number's value is " + b);
	}

}


// class name - SwapVariables - upper camel case
// variable/file name - swapVariables - camel case
