package javaIntroduction;
import java.util.*;
public class InputandOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);      
		System.out.println("Enter the first number:");
		long a;
		a = sc.nextLong();
		System.out.println("Enter the second number:");
		long b;
		b = sc.nextLong();
		System.out.println("Enter the third number:");
		long c;
		c = sc.nextLong();
		
		if(a > b & a > c) 
		{
			System.out.println(a + " " + "is the greatest");
		}
		else if(b > a & b > c) 
		{
			System.out.println(b + " " + "is the greatest");
		} 
		else if(c > a & c > b)
		{
			System.out.println(c + " " + "is the greatest");
		} 
		else
		{
			System.out.println("Some values are equal, put in different integers.");
		}
		
		System.out.println("The sum of the numbers is" +" " + (a + b + c));

	}

}
