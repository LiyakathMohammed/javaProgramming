package javaIntroduction;
import java.util.*;
public class GCDofNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n, a, numberChecker;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		System.out.print("Enter a number: ");
		a = sc.nextInt();
		for(numberChecker=n; numberChecker>0; numberChecker--) {
			if((n%numberChecker)==0 & (a%numberChecker)==0) {
				System.out.println("The GCD of your number inputed is" + " " +numberChecker);
				numberChecker=0;
			}
		}
	}
}
