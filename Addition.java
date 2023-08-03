package myProject1;

import java.util.*;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num1 = sc.nextInt();
		System.out.println("Enter another number: ");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	}

}
