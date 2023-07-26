package javaIntroduction;
import java.util.*;
public class LeapYear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		long a;
		a = sc.nextLong();   
	
		if(a%4 == 0) 
		{
			System.out.println("This year is a leap year! You have an extra day!");
		}
		else
		{
			System.out.println("This year is not a leap year");
		}
	}
}