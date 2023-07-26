package javaIntroduction;
import java.util.*;
public class ConvertingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a;
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b;
		b = sc.nextInt();
		int c = b;
		b = a;
		a = c;
		System.out.println("The first number's value is " + a);
		System.out.println("The second number's value is " + b);
	}

}
