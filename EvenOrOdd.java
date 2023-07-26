package javaIntroduction;
import java.util.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a;
		a = sc.nextInt();
		
		if(a%2 == 1)
		{
			System.out.println(a + " is an odd number");	
		}
		
		else if(a%2 == 0)
		{
			System.out.println(a + " is an even number");	
		}
		else{
			System.out.println("The number isn't even or odd");
		}
	}

}
