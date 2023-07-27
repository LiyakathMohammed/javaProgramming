package javaIntroduction;
import java.util.*;
public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		long number1, b, a, c;
		number1 = sc.nextLong();
		b = number1;
		c = number1;
		a = 1;
		
		while(a != c) {
			b--;
			number1 = (b*number1);
			a++;
		}
		System.out.println("The number " + number1 + " is " +  c + " factorial");
    }
}
